package com.mightycoder.di.literalwithpropertiesfile;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {
    public static void main(String[] args) {

        // load the application context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextPart5.xml");

        // get the bean form the container
        BaseballCoach theCoach = context.getBean("baseballCoach", BaseballCoach.class);


        // call the function from the container
        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getEmail());
        System.out.println(theCoach.getTeam());


        // close the application context
        context.close();
    }
}
