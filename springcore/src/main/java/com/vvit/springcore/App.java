package com.vvit.springcore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.vvit.springcore.service.CoffeMachine;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        //BeanFactory
        //ApplicationContext
        
		/*
		 * ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		 * 
		 * CoffeMachine coffeMachine=(CoffeMachine) context.getBean("coffeMachine");
		 * coffeMachine.orderCoffe();
		 */
        
        BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("config.xml"));
        CoffeMachine coffeMachine=(CoffeMachine) beanFactory.getBean("coffeMachine");
        coffeMachine.orderCoffe();
    }
}
