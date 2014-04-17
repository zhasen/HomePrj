package demo;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.activerecord.dialect.AnsiSqlDialect;
import com.jfinal.plugin.c3p0.C3p0Plugin;
import com.jfinal.render.ViewType;

public class DemoConfig extends JFinalConfig {
	public void configConstant(Constants me) {
		me.setDevMode(true);
		me.setViewType(ViewType.JSP);
	}

	public void configRoute(Routes me) {
		me.add("/hello", HelloController.class);
		me.add(new FrontRoutes());
	}

	public void configPlugin(Plugins me) {
		C3p0Plugin cp = new C3p0Plugin("jdbc:sqlserver://10.200.15.53:1433;DatabaseName=test",
				"sa", 
				"sasa",
				"com.microsoft.sqlserver.jdbc.SQLServerDriver");
		me.add(cp);
		ActiveRecordPlugin arp = new ActiveRecordPlugin(cp);
		me.add(arp);
		arp.addMapping("[User]", User.class);
		arp.setDialect(new AnsiSqlDialect());
		
	}

	public void configInterceptor(Interceptors me) {
		me.add(new DemoInterceptor());
	}

	public void configHandler(Handlers me) {
	}
}
