package com.ambzer.springtransaction.demo2;

/**
 * Created by owa on 2017/7/2.
 */
public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void transfer(String outAccount, String inAccount, Double money) {
        accountDao.outMoney(outAccount, money);
        int i = 1 / 0;
        accountDao.inMonry(inAccount, money);
    }
}
