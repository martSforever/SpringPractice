package com.ambzer.springtransaction.demo3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Spring的声明式事务管理方式二：基于AspectJ的XML方式配置
 * Created by owa on 2017/7/2.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext3.xml")
public class AccountServiceImplTest {
    /*该类是使用spring的自动代理，在产生bean的时候就是使用增强型的service，不需要像demo2那样声明使用增强型的serviceProxy*/
    @Resource(name = "accountService3")
    private AccountService accountService;

    @Test
    public void transfer() throws Exception {
        accountService.transfer("aaa", "bbb", 200d);
    }

}