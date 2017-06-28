package com.ambzer.spring.beanlifecycle;

import com.ambzer.spring.base.UnitTestBase;
import com.ambzer.spring.lifecycle.BeanLifeCycleConfInXml;
import com.ambzer.spring.lifecycle.BeanLifeCycleImplMethod;
import org.junit.Test;

/**
 * Created by marts_forever on 28/06/2017.
 */
public class TestBeanLifeCycle extends UnitTestBase {

    public TestBeanLifeCycle() throws Exception {
        super("spring-lifecycle.xml");
    }

    @Test
    public void testLifeCycle(){
        BeanLifeCycleConfInXml beanLifeCycleConfInXml = super.getBean("beanLifeCycleConfInXml");
        beanLifeCycleConfInXml.say();
        BeanLifeCycleImplMethod beanLifeCycleImplMethod = super.getBean("beanLifeCycleImplMethod");
        beanLifeCycleImplMethod.say();
    }

    @Test
    public void testLIfeCycle2(){
        BeanLifeCycleImplMethod beanLifeCycleImplMethod = super.getBean("beanLifeCycleImplMethod");
        beanLifeCycleImplMethod.say();
    }

}
