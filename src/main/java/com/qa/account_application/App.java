package com.qa.account_application;

import entity.Account;
import entity.Services;

public class App {
	private App() {}
    public static void main(String[] args) {
        Services list = new Services();
        Account jordan = new Account("Jordan", "Venters", "2");
        Account navani = new Account("Navani", "Navs", "3");
        Account ash = new Account("Ashok", "Kerung", "4");
        list.addToAccountList(jordan);
        list.addToAccountList(navani);
        list.addToAccountList(ash);
        System.out.println(list.toJSON());
    }
}
