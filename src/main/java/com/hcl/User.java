package com.hcl;


import java.util.ArrayList;
import java.util.List;

public class User {
	
	public String customerName;
	public long accountNo;
	private double balance;
	private String Accounttype;
	
	
	public User() {
		
	}

	public User(String customerName, long accountNo, long balance, String accounttype) {
		super();
		this.customerName = customerName;
		this.accountNo = accountNo;
		this.balance = balance;
		Accounttype = accounttype;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccounttype() {
		return Accounttype;
	}

	public void setAccounttype(String accounttype) {
		Accounttype = accounttype;
	}
	
	/*
	 * public User addUser(User user){ if (getAccounttype().equals("ca")){
	 * 
	 * return user; } else if(getAccounttype().equals("sa")){ return user;
	 * 
	 * } else { return null; } }
	 */
	
	
	@Override
	public String toString() {
		return "User [customerName=" + customerName + ", accountNo=" + accountNo + ", balance=" + balance
				+ ", Accounttype=" + Accounttype + "]";
	}
	
	

}
