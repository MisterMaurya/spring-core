package com.mightycoder.beanscopeprototype;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {
    public static void main(String[] args) {
        // load the application container
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-scope-prototype.xml");

        // get the bean form the container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        boolean result = theCoach == alphaCoach;

        System.out.println("Point the same object " + result);

        System.out.println("Memory location for theCoach " + theCoach);
        System.out.println("Memory location for alphaCoach " + alphaCoach);

        // close the context
        context.close();


    }
}
