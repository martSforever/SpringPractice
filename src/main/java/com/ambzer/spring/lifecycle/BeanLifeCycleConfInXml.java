package com.ambzer.spring.lifecycle;

/**
 * Created by marts_forever on 28/06/2017.
 */
public class BeanLifeCycleConfInXml {

    public BeanLifeCycleConfInXml() {
        super();
        System.out.println("BeanLifeCycleConfInXml construction");
    }

    public void init(){
        System.out.println("BeanLifeCycleConfInXml init;");
    }

    public void say(){
        System.out.println("BeanLifeCycleConfInXml say");
    }

    public void destroy(){
        System.out.println("BeanLifeCycleConfInXml destroy;");
    }

}
