package com.mightycoder.di.constructor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {

    public static void main(String[] args) {
        // load the application context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextPart2.xml");
        // get bean from the application context
        Coach theCoach = context.getBean("myCoach", Coach.class);
        // call the method from the beans
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getFortune());

        // close the application context
        context.close();

    }
}
