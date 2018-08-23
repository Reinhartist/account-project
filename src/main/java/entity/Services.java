package entity;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.GsonBuilder;

public class Services {
	private Map<Integer, Account> accountList;
	private int counter;
	
	public Services() {
		accountList = new HashMap<>();
		counter = 1;
	}
	
	public void addToAccountList(Account account) {
		accountList.put(counter, account);
		counter++;
	}
	
	public Account getAccount(int i) {
		return accountList.get(i);
	}
	
	public String toJSON() {
		return (new GsonBuilder()).setPrettyPrinting().create().toJson(accountList);
	}
	
	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		for(int i = 1; i < counter; i++) {
			s.append(i + " " + accountList.get(i).toString() + "\n");
		}
		return s.toString();
	}
}
