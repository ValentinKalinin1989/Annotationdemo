package com.luv2code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("thatTennisCoach")
public class TennisCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Playing in tennis.";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
