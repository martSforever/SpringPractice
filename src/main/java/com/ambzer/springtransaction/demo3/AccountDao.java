package com.ambzer.springtransaction.demo3;

/**
 * Created by owa on 2017/7/2.
 */
public interface AccountDao {

    /**
     * @param outAccount：转出账号
     * @param monry：转出金额
     */
    public void outMoney(String outAccount, Double monry);

    /**
     * @param inAccount：转入账号
     * @param monry：转入金额
     */
    public void inMonry(String inAccount, Double monry);

}
