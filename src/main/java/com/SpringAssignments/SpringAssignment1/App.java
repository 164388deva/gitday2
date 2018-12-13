package com.SpringAssignments.SpringAssignment1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
       Customer customer=(Customer)context.getBean("customer");
       System.out.println(customer);
       Customer customer1=(Customer)context.getBean("customer1");
       System.out.println(customer1);
    }
}
