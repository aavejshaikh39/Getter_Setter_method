package com.aavej_12182;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        student s1 = (student) context.getBean("studBean1");
        System.out.println(s1);
        
        student s2 = (student) context.getBean("studBean2");
        System.out.println(s2);
        
        
    }
}
