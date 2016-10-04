package com.itea.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TextEditorImp implements TextEditor{


    private SpellChecker spellChecker;
    @Autowired
    private SpellChecker2 spellChecker2;

    private String s  = "1";

    public void setS(String s) {
        this.s = s;
    }
    public String getS() {
        return s;
    }

    public TextEditorImp(SpellCheckerImp spellChecker){
        System.out.println("Inside TextEditor " );
        this.spellChecker =  spellChecker;        //

    }

    public void spellCheck(String message){
        spellChecker.checkSpelling(message);

    }
    public void DoIt(){
        spellChecker2.checkSpelling("SpellChecker2");
    }
}
