package com.ambzer.springtransaction.demo4;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by owa on 2017/7/2.
 */
@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, readOnly = true)
public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void transfer(String outAccount, String inAccount, Double money) {
        accountDao.outMoney(outAccount, money);
//        int i = 1 / 0;
        accountDao.inMonry(inAccount, money);
    }
}
