package com.mightycoder.di.literal;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {
    public static void main(String[] args) {
        // load the application context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextPart4.xml");
        // get the bean from the container
        BaseballCoach theCoach = context.getBean("myCoach", BaseballCoach.class);

        // call the method form the bean
        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getEmail());
        System.out.println(theCoach.getTeam());


        // close the application context
        context.close();

    }
}
