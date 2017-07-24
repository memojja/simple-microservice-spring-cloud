package com.example.demo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/**
 * Created by memojja on 24/07/2017.
 */
@Repository
public class StubAccountRepository implements AccountRepository {

    private Map<String,Account> accountsByNumber = new HashMap<String,Account>();


    public StubAccountRepository(){
        Account account= new Account(500L,"1","Mehmet");
        accountsByNumber.put("1",account);
        account= new Account(500L,"3","Ali");
        accountsByNumber.put("2",account);
        account= new Account(500L,"2","Veli");
        accountsByNumber.put("3",account);
        Logger.getLogger(StubAccountRepository.class.getName()).info("created StubAccountRepository");

    }

    @Override
    public List<Account> getAllAccounts() {
        return new ArrayList<Account>(accountsByNumber.values());
    }

    @Override
    public Account getAccount(String number) {
        return accountsByNumber.get(number);
    }
}
