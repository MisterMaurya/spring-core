package com.mightycoder.di.literal;

public class HappyFortune implements FortuneService {

    @Override
    public String getDailyFortune() {
        return "Your daily will be so lucky";
    }
}
