package com.example.demo;

import java.util.List;

/**
 * Created by memojja on 24/07/2017.
 */
public interface AccountRepository {
    List<Account> getAllAccounts();

    Account getAccount(String number);
}
