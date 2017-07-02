package com.ambzer.springtransaction.demo1;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * Created by owa on 2017/7/2.
 */
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao{
    public void outMoney(String outAccount, Double monry) {
        String sql = "update ACCOUNT set money = money - ? where name = ?";
        this.getJdbcTemplate().update(sql,monry,outAccount);
    }

    public void inMonry(String inAccount, Double monry) {
        String sql = "update ACCOUNT set money = money + ? where name = ?";
        this.getJdbcTemplate().update(sql,monry,inAccount);
    }
}
