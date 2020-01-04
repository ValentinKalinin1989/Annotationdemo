package com.luv2code;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BasketCoach implements Coach {
    @Autowired
    @Qualifier("randomService")
    private FortuneService fortuneService;

    //default constructor
    public BasketCoach() {
        System.out.println(">> inside default constructor");
    }
    /*
    @Autowired
    public BasketCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }
     */

    //define a setter method
    /*
    @Autowired
    public void setFortuneService(FortuneService theFortuneService) {
        System.out.println(">> BasketCoach: inside setFortuneService() method");
        fortuneService = theFortuneService;
    }
     */

    @Override
    public String getDailyWorkout() {
        return "Playing in basketball.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
