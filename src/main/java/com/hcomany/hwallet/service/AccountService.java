package com.hcomany.hwallet.service;

import com.hcomany.hwallet.pojo.AccountDetails;
import com.hcomany.hwallet.pojo.UserDetails;

public interface AccountService {

    public AccountDetails createAccount(UserDetails userDetails);

    public AccountDetails deposit(String accountDetails,Double amount);

    public AccountDetails withdraw(String accountDetails,Double amount);

    public AccountDetails transfer(String sourceAccountDetails,String targetAccountDetails,Double amount);
}
