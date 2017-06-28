package com.ambzer.spring.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by marts_forever on 29/06/2017.
 */
public class AmbzerApplicationContext implements ApplicationContextAware {
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("AmbzerApplicationContext:"+applicationContext.getBean("ambzerApplicationContext").hashCode());
    }
}
