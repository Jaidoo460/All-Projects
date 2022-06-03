package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class BankCustomer implements Accountable {

    private String name;
    private String address;
    private String phoneNumber;
    private List<Accountable> accounts = new ArrayList<>();

//    public BankCustomer(String name, String address, String phoneNumber) {
//        this.name = name;
//        this.address = address;
//        this.phoneNumber = phoneNumber;
//        this.accounts = new ArrayList<>();
//    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public List<Accountable> getAccounts() {
        return accounts;
    }

    public void addAccount(Accountable newAccount) {
        this.accounts.add(newAccount);

    }

    public boolean isVip() {
        if (getBalance() >= 25000) {
            return true;
        }
        return false;
    }


    @Override
    public int getBalance() {
        return 0;
    }

//    @Override
//    public int getDebt() {
//        return 0;
//    }
}
