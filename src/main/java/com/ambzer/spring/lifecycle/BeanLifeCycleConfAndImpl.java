package com.ambzer.spring.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by marts_forever on 28/06/2017.
 */
public class BeanLifeCycleConfAndImpl implements InitializingBean,DisposableBean {

    public BeanLifeCycleConfAndImpl() {
        System.out.println("BeanLifeCycleConfAndImpl construct");
    }

    public void say(){
        System.out.println("BeanLifeCycleConfAndImpl say");

    }

    public void init(){
        System.out.println("BeanLifeCycleConfAndImpl init");

    }

    public void destroy2(){
        System.out.println("BeanLifeCycleConfAndImpl destroy2");

    }

    public void destroy() throws Exception {
        System.out.println("BeanLifeCycleConfAndImpl destroy");

    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("BeanLifeCycleConfAndImpl afterPropertiesSet");

    }
}
