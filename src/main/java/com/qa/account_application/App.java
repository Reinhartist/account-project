package com.qa.account_application;

import entity.Account;
import entity.Services;

public class App {
	private App() {}
    public static void main(String[] args) {
        Account jordan = new Account("Jordan", "Venters", "92");
        Account josh = new Account("Jordan", "Venters", "92");
        System.out.println(jordan == josh);
    }
}
