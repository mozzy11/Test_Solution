package moz.org;
import javax.naming.Context;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;


public class DrawingApp {

	public static void main(String[] args) {	
		//Using Spring Context to instatitae(inject) the Triangle object	
		ApplicationContext context = new ClassPathXmlApplicationContext ("spring.xml");		
		Triangle tria = (Triangle )context.getBean("tri"); //N.B here u pas in the bean i.d u defined in the XML descriptor		
		tria.draw();
	}

}
