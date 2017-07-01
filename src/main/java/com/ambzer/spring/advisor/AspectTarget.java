package com.ambzer.spring.advisor;

import org.springframework.dao.PessimisticLockingFailureException;
import org.springframework.stereotype.Component;

/**
 * Created by owa on 2017/7/1.
 */
@Component
public class AspectTarget {
    public void invoke() {
        System.out.println("invoke...");
    }

    public void invokeException() {
        throw new PessimisticLockingFailureException("");
    }
}
