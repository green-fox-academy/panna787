package com.greenfoxacademy.bankofsimba.models;

import java.util.ArrayList;
import java.util.List;

public class BankAccountList {
    private List<BankAccount> accounts = new ArrayList<>();

    public BankAccountList(){
        accounts.add(new BankAccount("Scar", 1500, "lion"));
        accounts.add(new BankAccount("Shenzi", 200, "hyena"));
        accounts.add(new BankAccount("Banzai", 150, "hyena"));
        accounts.add(new BankAccount("Ed", 50, "hyena"));
    }

    public List<BankAccount> getAccounts(){
        return accounts;
    }

}
