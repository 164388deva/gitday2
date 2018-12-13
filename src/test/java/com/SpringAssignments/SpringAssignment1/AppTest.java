package com.SpringAssignments.SpringAssignment1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AppTest 
{
	
	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
    Customer customer=(Customer)context.getBean("customer");
Customer customer1=(Customer)context.getBean("customer1");


    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue(customer.getCustomerId()==101 );
        assertTrue(customer.getCustomerName().equals("Deva") );
        assertTrue(customer.getCustomerContact()==123456 );
        assertTrue(customer1.getCustomerId()==101 );
        assertTrue(customer1.getCustomerName().equals("Deva") );
        assertTrue(customer1.getCustomerContact()==123456 );
        assertTrue(customer1.getCustomerAddress().getCity().equals("bengaluru"));
        assertTrue(customer1.getCustomerAddress().getState().equals("Karnataka"));
        assertTrue(customer1.getCustomerAddress().getStreet().equals("Sardar Street"));
        assertTrue(customer1.getCustomerAddress().getZip()==560056);
        assertTrue(customer1.getCustomerAddress().getCountry().equals("India"));
        assertTrue(customer.getCustomerAddress().getCity().equals("bengaluru"));
        assertTrue(customer.getCustomerAddress().getState().equals("Karnataka"));
        assertTrue(customer.getCustomerAddress().getStreet().equals("Sardar Street"));
        assertTrue(customer.getCustomerAddress().getZip()==560056);
        assertTrue(customer.getCustomerAddress().getCountry().equals("India"));


    }
}
