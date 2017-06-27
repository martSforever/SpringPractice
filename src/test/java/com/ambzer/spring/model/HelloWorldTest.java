package com.ambzer.spring.model;

import com.ambzer.spring.test.UnitTestBase;
import org.junit.Test;

/**
 * Created by owa on 2017/6/27.
 */
public class HelloWorldTest extends UnitTestBase {
    @Test
    public void printHello() throws Exception {
        HelloWorld obj = (HelloWorld) getClassPathXmlApplicationContext().getBean("helloBean");
        obj.printHello();
    }

}