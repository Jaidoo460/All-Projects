package com.techelevator;

public class CheckingAccount extends BankAccount{

    private int overdraftFee = 10;

    public CheckingAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    public CheckingAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }

    @Override
    public int withdraw(int amountToWithdraw){
        int newBalance = super.withdraw(amountToWithdraw);
        if((newBalance <= 0) && (newBalance > -100)){
            newBalance = super.withdraw(overdraftFee);
        }
        else if (newBalance <= -100){
            newBalance = super.deposit(amountToWithdraw);
        }
        return newBalance;
    }
}
