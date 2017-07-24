package com.example.demo;

import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by memojja on 24/07/2017.
 */
@Controller
public class AccountController {

    private final AccountRepository accountRepository;

    @Autowired
    public AccountController(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/accountList")
    public String accountList(Model model){
        model.addAttribute("accounts",accountRepository.getAllAccounts());
        return "accountList";
    }

    @RequestMapping("/accountDetails")
    public String accountDetails(@RequestParam("number") String id,Model model){
        model.addAttribute("account",accountRepository.getAccount(id));
        return "accountDetails";
    }
}
