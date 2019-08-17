package com.mightycoder.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {

    public static void main(String[] args) {

        // load the application context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextPart1.xml");

        // get bean form the application context
        Coach theCoach = context.getBean("myCoach", Coach.class);

        // call the method from the bean
        System.out.println(theCoach.getDailyWorkout());

        // close the application context
        context.close();

    }
}
