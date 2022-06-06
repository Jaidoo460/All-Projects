package com.techelevator.exceptions;

public class MinimumBalanceException extends Exception{

    public static final double MIN_BAL_LIMIT = 249.9;

    public MinimumBalanceException(){
        super("MINIMUM ");
    }
}
