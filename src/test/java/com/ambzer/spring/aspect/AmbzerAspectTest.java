package com.ambzer.spring.aspect;

import com.ambzer.spring.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by owa on 2017/6/30.
 */
public class AmbzerAspectTest extends UnitTestBase {

    public AmbzerAspectTest() throws Exception {
        super("spring-aspect.xml");
    }

    @Test
    public void testBefore() {
        AspectTarget aspectTarget = super.getBean("aspectTarget");
        aspectTarget.getName("ambzer","haha");
    }

}