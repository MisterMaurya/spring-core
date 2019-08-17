package com.mightycoder.di.setter;

public class HappyFortune implements FortuneService {

    @Override
    public String getDailyFortune() {
        return "You are super lucky";
    }
}
