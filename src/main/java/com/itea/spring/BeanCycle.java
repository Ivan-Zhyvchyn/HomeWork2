package com.itea.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by ivan on 10/4/16.
 */
public class BeanCycle implements BeanPostProcessor {


    public Object postProcessBeforeInitialization(Object bean,
                                                  String beanName) throws BeansException {
        System.out.println("BeforeInit " + beanName);
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean,
                                                 String beanName) throws BeansException {
        System.out.println("AfterInit " + beanName);

        return bean;
    }

}
