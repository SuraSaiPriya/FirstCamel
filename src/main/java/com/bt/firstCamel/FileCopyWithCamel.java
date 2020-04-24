package com.bt.firstCamel;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

public class FileCopyWithCamel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		CamelContext context=new DefaultCamelContext();
		
		context.addRoutes(new RouteBuilder() {
			public void configure() {
				
				from("file:C:/Users/sai priya/Documents/From?noop=true").to("file:C:/Users/sai priya/Documents/To");
			
			}
		});
		context.start();
		Thread.sleep(10000);
		context.stop();
	}
}