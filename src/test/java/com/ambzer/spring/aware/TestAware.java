package com.ambzer.spring.aware;

import com.ambzer.spring.base.UnitTestBase;
import org.junit.Test;

/**
 * Created by marts_forever on 29/06/2017.
 */
public class TestAware extends UnitTestBase {

    public TestAware() throws Exception {
        super("spring-aware.xml");
    }

    @Test
    public void testAware() {
        System.out.println("testAware:" + super.getBean("ambzerApplicationContext").hashCode());
    }

    @Test
    public void testBeanNameAware() {
        AmbzerBeanName ambzerBeanName = super.getBean("ambzerBeanName");
        System.out.println("testBeanNameAware:"+ambzerBeanName.hashCode());
    }

}
