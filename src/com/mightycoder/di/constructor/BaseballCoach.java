package com.mightycoder.di.constructor;

public class BaseballCoach implements Coach {

    private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice 15 hours daily";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }
}
