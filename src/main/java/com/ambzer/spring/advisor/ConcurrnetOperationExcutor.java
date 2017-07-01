package com.ambzer.spring.advisor;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.core.Ordered;
import org.springframework.dao.PessimisticLockingFailureException;

/**
 * Created by owa on 2017/7/1.
 */
public class ConcurrnetOperationExcutor implements Ordered {

    private static final int DEFAULT_MAX_RETRIES = 2;
    private int maxRetries = DEFAULT_MAX_RETRIES;
    private int order = 1;

    public int getMaxRetries() {
        return maxRetries;
    }

    public void setMaxRetries(int maxRetries) {
        this.maxRetries = maxRetries;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public int getOrder() {
        return 0;
    }

    public Object doConcurrentOperation(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        int numAttemps = 0;
        PessimisticLockingFailureException lockingFailureException;
        do {
            numAttemps++;
            System.out.println("Try times:" + numAttemps);
            try {
                return proceedingJoinPoint.proceed();
            } catch (PessimisticLockingFailureException e) {
                lockingFailureException = e;
            }
        } while (numAttemps <= this.maxRetries);
        System.out.println("Try error:" + numAttemps);
        throw lockingFailureException;
    }
}
