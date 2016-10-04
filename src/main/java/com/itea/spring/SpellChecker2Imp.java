package com.itea.spring;

import org.springframework.stereotype.Component;

@Component
public class SpellChecker2Imp implements SpellChecker2 {

    public String getS() {
        return s;
    }
    public void setS(String s) {
        this.s = s;
    }

    private String s = "1";

    public SpellChecker2Imp() {

    }
    public void checkSpelling(String message){
            System.out.println( message );
    }

}
