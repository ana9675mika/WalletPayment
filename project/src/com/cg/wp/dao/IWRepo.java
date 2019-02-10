package com.cg.wp.dao;

import java.util.HashMap;
import java.util.Map;

import com.cg.wp.bean.Customer;
import com.cg.wp.bean.Wallet;
import com.cg.wp.exception.WalletException;

public interface IWRepo {
	 public Map createAccount(Customer c) throws WalletException;
		public void showBalance(HashMap<Integer, Customer> h1) throws WalletException;
	    void deposit(HashMap<Integer, Customer> h1, Customer c);
		void withdraw(HashMap<Integer, Customer> h1, Customer c);
		
		

}