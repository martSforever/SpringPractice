package com.ambzer.springtransaction.demo1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by owa on 2017/7/2.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class AccountServiceImplTest {

    @Resource(name = "accountService")
    private AccountService accountService;

    @Test
    public void demo1() throws Exception {
        accountService.transfer("aaa", "bbb", 200d);
    }

}