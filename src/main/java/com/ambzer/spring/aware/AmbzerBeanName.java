package com.ambzer.spring.aware;

import org.springframework.beans.factory.BeanNameAware;

/**
 * Created by marts_forever on 29/06/2017.
 */
public class AmbzerBeanName implements BeanNameAware {
    public void setBeanName(String s) {
        System.out.println("AmbzerBeanName:"+s);
    }
}
