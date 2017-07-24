package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by memojja on 24/07/2017.
 */
@RestController
public class AccountController {

    protected Logger logger =Logger.getLogger(AccountController.class.getName());

    private final AccountRepository accountRepository;

    @Autowired
    public AccountController(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @RequestMapping("/accounts")
    public List<Account> getAll(){
        logger.info("account-service getAll() invoked");
        List<Account> accounts = accountRepository.getAllAccounts();
        logger.info("account-service found:" + accounts.size());
        return accounts;

    }

    @RequestMapping("/accounts/{id}")
    public Account getById(@PathVariable("id")String id){
        logger.info("account-service getById invoked: "+id);
        Account account = accountRepository.getAccount(id);
        logger.info("account-service found : "+account);
        return account;
    }
}
