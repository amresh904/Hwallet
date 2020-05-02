package com.hcomany.hwallet.service;

import com.hcomany.hwallet.dao.AccountServiceDAO;
import com.hcomany.hwallet.pojo.AccountDetails;
import com.hcomany.hwallet.pojo.UserDetails;

public class AccountServiceImpl implements AccountService{

    AccountServiceDAO accountServiceDAO=new AccountServiceDAO();

    @Override
    public AccountDetails createAccount(UserDetails userDetails) {
        return accountServiceDAO.createAccount(userDetails);
    }

    @Override
    public AccountDetails deposit(String accountDetails, Double amount) {
        return accountServiceDAO.deposit(accountDetails,amount);
    }

    @Override
    public AccountDetails withdraw(String accountDetails, Double amount) {
        return accountServiceDAO.withdraw(accountDetails,amount);
    }

    @Override
    public AccountDetails transfer(String sourceAccountDetails, String targetAccountDetails, Double amount) {
        return accountServiceDAO.transfer(sourceAccountDetails,targetAccountDetails,amount);
    }
}
