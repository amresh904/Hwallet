package com.hcomany.hwallet.dao;

import com.hcomany.hwallet.pojo.AccountDetails;
import com.hcomany.hwallet.pojo.UserDetails;

import java.time.Instant;
import java.util.HashMap;

public class AccountServiceDAO {

    HashMap<String,AccountDetails> accountDetailsList=new HashMap<>();
    UserServiceDAO userServiceDAO=new UserServiceDAO();

    public AccountDetails createAccount(UserDetails userDetails){

        AccountDetails accountDetails;
        if(userServiceDAO.getUser(userDetails.getId())!=null){
            accountDetails=new AccountDetails();
            accountDetails.setUserGUID(userDetails.getId());
            accountDetails.setOpeningDate(Long.toString(Instant.now().toEpochMilli()));
            accountDetails.setAccountNumber(userDetails.getId()+"-"+userDetails.getGovID());
            accountDetails.setBalance(0d);
            accountDetailsList.put(accountDetails.getAccountNumber(),accountDetails);
            return  accountDetails;
        }
        return null;
    }

    public AccountDetails deposit(String accountNumber,Double amount){
        if(accountNumber!=null && accountDetailsList.get(accountNumber)!=null){
            AccountDetails accountDetails=accountDetailsList.get(accountNumber);
            accountDetails.setBalance(accountDetails.getBalance()+amount);
            accountDetailsList.put(accountDetails.getAccountNumber(),accountDetails);
            return accountDetails;
        }
        return null;
    }

    public AccountDetails withdraw(String accountNumber,Double amount){
        if(accountNumber!=null && accountDetailsList.get(accountNumber)!=null){
            AccountDetails accountDetails=accountDetailsList.get(accountNumber);
            if(accountDetails.getBalance()>amount){
                accountDetails.setBalance(accountDetails.getBalance()-amount);
                accountDetailsList.put(accountDetails.getAccountNumber(),accountDetails);
                return accountDetails;
            }
        }
        return null;
    }

    public AccountDetails transfer(String accountNumber,String targetAccountNumber,Double amount){
        if(accountNumber!=null && accountDetailsList.get(accountNumber)!=null &&  accountDetailsList.get(targetAccountNumber)!=null){
            AccountDetails accountDetails=accountDetailsList.get(accountNumber);
            AccountDetails targetAccountDetails=accountDetailsList.get(targetAccountNumber);
            if(accountDetails.getBalance()>amount){
                accountDetails.setBalance(accountDetails.getBalance()-amount);
                targetAccountDetails.setBalance(targetAccountDetails.getBalance()+amount);
                accountDetailsList.put(accountDetails.getAccountNumber(),accountDetails);
                accountDetailsList.put(targetAccountNumber,targetAccountDetails);
                return accountDetails;
            }
        }
        return null;
    }

}
