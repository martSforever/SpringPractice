package com.ambzer.spring.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by marts_forever on 28/06/2017.
 */
public class BeanLifeCycleImplMethod implements InitializingBean, DisposableBean {

    public BeanLifeCycleImplMethod() {
        super();
        System.out.println("BeanLifeCycleImplMethod construction");
    }
    public void say(){
        System.out.println("BeanLifeCycleImplMethod say");
    }

    public void destroy() throws Exception {
        System.out.println("BeanLifeCycleImplMethod destroy");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("BeanLifeCycleImplMethod afterPropertiesSet");
    }
}
