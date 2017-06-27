package com.ambzer.spring;

import com.ambzer.spring.base.UnitTestBase;
import com.ambzer.spring.injection.PropertiesInjectionService;
import org.junit.Test;

/**
 * Created by marts_forever on 28/06/2017.
 */
public class TestInjection extends UnitTestBase {

    public TestInjection() throws Exception {
        super("spring-injection.xml");
    }

    @Test
    public void testInjection(){
        PropertiesInjectionService propertiesInjectionService = super.getBean("PropertiesInjectionService");
        propertiesInjectionService.doSave("hello world!");
    }

}
