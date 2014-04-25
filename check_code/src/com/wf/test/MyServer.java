package com.wf.test;

import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.nio.SelectChannelConnector;
import org.eclipse.jetty.webapp.WebAppContext;

public class MyServer {
	public static void main(String[] args) throws Exception {
//		Server server = new Server();
//
//		Connector connector = new SelectChannelConnector();
//		connector.setPort(8080);
//
//		server.setConnectors(new Connector[] { connector });
//
//		WebAppContext webAppContext = new WebAppContext("WebContent","/check_code");
//
//		//webAppContext.setContextPath("/");
//		webAppContext.setDescriptor("WebContent/WEB-INF/web.xml");
//		webAppContext.setResourceBase("WebContent");
//		webAppContext.setDisplayName("myProject");
//		webAppContext.setClassLoader(Thread.currentThread().getContextClassLoader());
//		webAppContext.setConfigurationDiscovered(true);
//		webAppContext.setParentLoaderPriority(true);
//		server.setHandler(webAppContext);
//		System.out.println(webAppContext.getContextPath());
//		System.out.println(webAppContext.getDescriptor());
//		System.out.println(webAppContext.getResourceBase());
//		System.out.println(webAppContext.getBaseResource());
//
//		try {
//			server.start();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println("server is  start");

		
//		Server server = new Server();
//        SelectChannelConnector connector8090 = new SelectChannelConnector();
//        connector8090.setPort(8090);
//        server.addConnector(connector8090);
//        WebAppContext context = new WebAppContext();
//        context.setContextPath("/");
//        context.setDescriptor("WebContent/WEB-INF/web.xml");
//        context.setResourceBase("WebContent");
//        context.setConfigurationDiscovered(true);
//        server.setHandler(context);
//        server.start();
//        System.out.println("srart at http://127.0.0.1:8089");
		
		
		
		Server server = new Server();
        SelectChannelConnector connector8082 = new SelectChannelConnector();
        connector8082.setPort(8082);
        server.addConnector(connector8082);
        WebAppContext context = new WebAppContext();
        context.setContextPath("/aa");
        //context.setDescriptor("web/WEB-INF/web.xml");
        context.setResourceBase("WebContent");
        context.setConfigurationDiscovered(true);
        server.setHandler(context);
        server.start();
        System.out.println("srart at http://testpophome.staff.xdf.cn/");
		
	}
}