package com.hcomany.controller;

import com.hcomany.hwallet.HwalletApplication;
import com.hcomany.hwallet.pojo.AccountDetails;
import com.hcomany.hwallet.pojo.TransactionDetails;
import com.hcomany.hwallet.pojo.UserDetails;
import com.hcomany.hwallet.service.AccountService;
import com.hcomany.hwallet.service.AccountServiceImpl;
import com.hcomany.hwallet.service.UserService;
import com.hcomany.hwallet.service.UserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("hwallet/accountservice")
public class AccountController {

    public static final Logger logger = LoggerFactory.getLogger(HwalletApplication.class);

    AccountService accountService=new AccountServiceImpl();

    @RequestMapping(value = "/registerAccount/", method = RequestMethod.POST)
    public ResponseEntity<AccountDetails> createAccount(@Valid @RequestBody UserDetails user, UriComponentsBuilder ucBuilder) {
        AccountDetails accountDetails = accountService.createAccount(user);
        if (accountDetails != null)
            return new ResponseEntity<AccountDetails>(accountDetails, HttpStatus.OK);
        else
            return new ResponseEntity<AccountDetails>(accountDetails, HttpStatus.BAD_REQUEST);
    }

    @RequestMapping(value = "/deposit/", method = RequestMethod.POST)
    public ResponseEntity<AccountDetails> deplosit(@Valid @RequestBody TransactionDetails transaction, UriComponentsBuilder ucBuilder) {
        AccountDetails accountDetails = accountService.deposit(transaction.getAccountNumber(),transaction.getAmount());
        if (accountDetails != null)
            return new ResponseEntity<AccountDetails>(accountDetails, HttpStatus.OK);
        else
            return new ResponseEntity<AccountDetails>(accountDetails, HttpStatus.BAD_REQUEST);
    }

    @RequestMapping(value = "/withdraw/", method = RequestMethod.POST)
    public ResponseEntity<AccountDetails> withdraw(@Valid @RequestBody TransactionDetails transaction, UriComponentsBuilder ucBuilder) {
        AccountDetails accountDetails = accountService.withdraw(transaction.getAccountNumber(),transaction.getAmount());
        if (accountDetails != null)
            return new ResponseEntity<AccountDetails>(accountDetails, HttpStatus.OK);
        else
            return new ResponseEntity<AccountDetails>(accountDetails, HttpStatus.BAD_REQUEST);
    }

    @RequestMapping(value = "/transfer/", method = RequestMethod.POST)
    public ResponseEntity<AccountDetails> registerUser(@Valid @RequestBody TransactionDetails transaction, UriComponentsBuilder ucBuilder) {
        AccountDetails accountDetails = accountService.transfer(transaction.getAccountNumber(),transaction.getTargetAccountNumber(),transaction.getAmount());
        if (accountDetails != null)
            return new ResponseEntity<AccountDetails>(accountDetails, HttpStatus.OK);
        else
            return new ResponseEntity<AccountDetails>(accountDetails, HttpStatus.BAD_REQUEST);
    }


}
