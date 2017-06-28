package com.ambzer.spring.beanscope;

import com.ambzer.spring.base.UnitTestBase;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by marts_forever on 28/06/2017.
 */
public class BeanScopeTest extends UnitTestBase {

    public BeanScopeTest() throws Exception {
        super("spring-beanscope.xml");
    }

    @Test
    public void say() throws Exception {
        BeanScope beanScope = super.getBean("beanScope");
        beanScope.say();
        BeanScope beanScope2 = super.getBean("beanScope");
        beanScope2.say();
    }

    @Test
    public void say2() throws Exception{
        BeanScope beanScope = super.getBean("beanScope");
        beanScope.say();
    }

}