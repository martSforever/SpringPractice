package com.ambzer.spring.introduction;

import com.ambzer.spring.base.UnitTestBase;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by owa on 2017/6/30.
 */
public class FitTest extends UnitTestBase {

    public FitTest() throws Exception {
        super("spring-introduction.xml");
    }

    @Test
    public void filter(){
        Fit fit = super.getBean("aspectTarget");
        fit.filter();
    }

}