package com.ambzer.spring.util;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by owa on 2017/6/27.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class MessageUtilsTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void sayHello() throws Exception {
        assertEquals(MessageUtils.sayHello(),"hello world!");
    }

}