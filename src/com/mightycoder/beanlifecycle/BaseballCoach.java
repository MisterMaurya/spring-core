package com.mightycoder.beanlifecycle;

public class BaseballCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Doing great work";
    }

    public void startUpMethod() {
        System.out.println("BaseballCoach : startUpMethod call");
    }

    public void destroyMethod() {
        System.out.println("BaseballCoach : destroyMethod call");
    }

}
