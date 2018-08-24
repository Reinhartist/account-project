package com.qa.account_application;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import entity.Account;
import entity.Services;

public class servicesTest {
	@Test
	public void testServicesCountByFirstName() {
        Services list = new Services();
        Account jordan = new Account("Jordan", "Venters", "2");
        Account navani = new Account("Navani", "Navs", "3");
        Account ash = new Account("Ashok", "Kerung", "4");
        list.addToAccountList(jordan);
        list.addToAccountList(navani);
        list.addToAccountList(ash);
        assertEquals(list.countByFirstName("Jordan"), 1);
	}
}
