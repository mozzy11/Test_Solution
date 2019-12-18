package org.mozzy;

import org.mozzy.Service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAop {

	public static void main(String[] args) {
		
		ApplicationContext ctx =  new ClassPathXmlApplicationContext("Spring.xml");
		ShapeService shapeService = (ShapeService)ctx.getBean("shapeService");
		System.out.println (shapeService.getCircle().getName());		
		System.out.println (shapeService. getTriangle().getName());		
	}
}
