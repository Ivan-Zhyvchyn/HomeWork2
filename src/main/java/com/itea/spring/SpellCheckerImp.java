package com.itea.spring;

import org.springframework.stereotype.Component;

@Component
public class SpellCheckerImp implements SpellChecker{
    public SpellCheckerImp(){
     //   System.out.println("Inside SpellChecker " );
    }

    public void checkSpelling(String message){
        System.out.println( message );
    }

}
