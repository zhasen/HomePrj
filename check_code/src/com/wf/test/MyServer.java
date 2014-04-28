package com.wf.test;

import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.nio.SelectChannelConnector;
import org.eclipse.jetty.webapp.WebAppContext;

public class MyServer {
	public static void main(String[] args) throws Exception {		
		Server server = new Server();
        SelectChannelConnector connector8082 = new SelectChannelConnector();
        connector8082.setPort(8082);
        server.addConnector(connector8082);
        WebAppContext context = new WebAppContext();
        context.setContextPath("/");
        //context.setDescriptor("web/WEB-INF/web.xml");
        context.setResourceBase("WebContent");
        context.setConfigurationDiscovered(true);
        server.setHandler(context);
        server.start();
        System.out.println("srart at http://127.0.0.1:8082/");
		
	}
}