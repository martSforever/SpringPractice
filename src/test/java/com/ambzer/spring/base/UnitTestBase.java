package com.ambzer.spring.base;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by owa on 2017/6/27.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class UnitTestBase {

    private ClassPathXmlApplicationContext classPathXmlApplicationContext;
    private String springXmlPath = "classpath*:spring-*.xml";

    public UnitTestBase() {
    }

    public UnitTestBase(String springXmlPath) throws Exception {
        if (springXmlPath == null || springXmlPath.equals("")) throw new Exception("springXmlPath is empty!");
        this.springXmlPath = "classpath*:"+springXmlPath;
    }

    @Before
    public void before() {
        classPathXmlApplicationContext = new ClassPathXmlApplicationContext(springXmlPath.split("[,\\s]+"));
        classPathXmlApplicationContext.start();
    }

    @After
    public void after() {
        classPathXmlApplicationContext.destroy();
    }

    public ClassPathXmlApplicationContext getClassPathXmlApplicationContext() {
        return classPathXmlApplicationContext;
    }

    public void setClassPathXmlApplicationContext(ClassPathXmlApplicationContext classPathXmlApplicationContext) {
        this.classPathXmlApplicationContext = classPathXmlApplicationContext;
    }

    protected <T extends Object> T getBean(String beanId){
        return (T) classPathXmlApplicationContext.getBean(beanId);
    }

    protected <T extends Object> T getBean(Class beanClass){
        return (T) classPathXmlApplicationContext.getBean(beanClass);
    }



}
