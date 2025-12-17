package com.gaja.utils;

public class SwimCooach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "practise swim for 1000 mts";
    }

    public SwimCooach(){
        System.out.println("construtor: "+getClass().getSimpleName());
    }
}
