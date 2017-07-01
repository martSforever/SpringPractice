package com.ambzer.spring.advisor;

import com.ambzer.spring.base.UnitTestBase;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by owa on 2017/7/1.
 */
public class AspectTargetTest extends UnitTestBase {

    public AspectTargetTest() throws Exception {
        super("spring-advisor.xml");
    }

    @Test
    public void testAdvisor() {
        AspectTarget aspectTarget = super.getBean("aspectTarget");
        aspectTarget.invoke();
        System.out.println("--------------------");
        aspectTarget.invokeException();
    }
}