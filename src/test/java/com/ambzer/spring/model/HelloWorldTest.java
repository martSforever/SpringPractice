package com.ambzer.spring.model;

import com.ambzer.spring.base.UnitTestBase;
import org.junit.Test;

/**
 * Created by owa on 2017/6/27.
 */
public class HelloWorldTest extends UnitTestBase {

    public HelloWorldTest() throws Exception {
        super("spring-beans.xml");
    }

    @Test
    public void printHello() throws Exception {
        HelloWorld obj = (HelloWorld) super.getBean("helloBean");
        obj.printHello();
    }

}