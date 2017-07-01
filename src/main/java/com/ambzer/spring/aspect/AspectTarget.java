package com.ambzer.spring.aspect;

/**
 * Created by owa on 2017/6/30.
 */
public class AspectTarget {

    public void biz() {
        System.out.println("biz...");
    }

    public String getName(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;
        System.out.println("getName:" + fullName + "...");
        return fullName;
    }

}
