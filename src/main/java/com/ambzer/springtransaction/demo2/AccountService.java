package com.ambzer.springtransaction.demo2;

/**
 * Created by owa on 2017/7/2.
 */
public interface AccountService {
    /**
     * @param outAccount 转出的账号
     * @param inAccount 转入的账号
     * @param money 转移的金额
     */
    public void transfer(String outAccount, String inAccount, Double money);
}
