package com.itea.spring;

import org.springframework.context.annotation.*;


@Configuration
public class TextEditorConfig {

    @Bean
    @Scope("singleton")
    public TextEditorImp textEditor(){
        return new TextEditorImp((SpellCheckerImp) spellChecker());
    }

    @Bean
    public SpellChecker spellChecker(){
        return new SpellCheckerImp();
    }

    @Bean
    @Scope("prototype")
    public SpellChecker2 spellChecker2(){
        return new SpellChecker2Imp();
    }

    @Bean
    public BeanCycle beanCycle(){
        return new BeanCycle();
    }
}