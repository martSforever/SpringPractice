package com.ambzer.spring.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by owa on 2017/6/30.
 */
public class AmbzerAspect {

    public void before() {
        System.out.println("before...");
    }

    public void afterReturning() {
        System.out.println("after returing...");
    }

    public Object doBasicProfiling(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("doBasicProfiling before");
        Object retVal = proceedingJoinPoint.proceed();
        System.out.println("doBasicProfiling after");
        return retVal;
    }

    public Object interceptGetName(ProceedingJoinPoint point, String firstName, String lastName) throws Throwable {
        if ((firstName).equals("ambzer")) lastName = "martsforever";
        List<Object> objectList = new ArrayList<Object>();
        /*按照顺序依次将object传入参数列表中*/
        objectList.add(firstName);
        objectList.add(lastName);
        Object obj = point.proceed(objectList.toArray());
        return obj;
    }

}
