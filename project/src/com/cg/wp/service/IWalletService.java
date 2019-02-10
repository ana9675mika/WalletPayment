package com.cg.wp.service;

import java.util.HashMap;
import java.util.Map;

import com.cg.wp.bean.Customer;
import com.cg.wp.exception.WalletException;

public interface IWalletService  {

    public Map createAccount(Customer c) throws WalletException;
	public void showBalance(HashMap<Integer, Customer> h1) throws WalletException;
   public void deposit(HashMap<Integer, Customer> h1, Customer c);
   public void withdraw(HashMap<Integer, Customer> h1, Customer c);
	public boolean validateMobNo(Long phn);
	public boolean validateAmount(int amount);
	
	
	
}
