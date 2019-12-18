package org.mozzy.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
 
       //Using Wild Cards to get any "save" method
        @Before("execution(public * save*(..))")
         public void Advice(){
		 System.out.println("Check my sve methods");	
		 }
}

 