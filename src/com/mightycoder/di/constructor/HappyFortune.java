package com.mightycoder.di.constructor;

public class HappyFortune implements FortuneService {

    @Override
    public String getFortune() {
        return "You are very lucky";
    }
}
