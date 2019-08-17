package com.mightycoder.di.setter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {
    public static void main(String[] args) {
        // load the application context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextPart3.xml");

        // get bean form the container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        // call the method from the container
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        // close the application context
        context.close();
    }
}
