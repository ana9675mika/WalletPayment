package com.cg.wp.service;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.cg.wp.bean.Customer;
import com.cg.wp.bean.Wallet;
import com.cg.wp.dao.WalletDao;
import com.cg.wp.exception.WalletException;

public class WalletDetails implements IWalletService{

	WalletDao wdao;
	public WalletDetails() {
		// TODO Auto-generated constructor stub
		wdao = new WalletDao();
	} 
	
	@Override
	public Map createAccount(Customer c) throws WalletException {
		// TODO Auto-generated method stub
		return wdao.createAccount(c);
	}

	@Override
	public void showBalance(HashMap<Integer, Customer> h1) throws WalletException {
		// TODO Auto-generated method stub
		
	System.out.println();
	}

	@Override
	public void deposit(HashMap<Integer, Customer> h1, Customer c) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void withdraw(HashMap<Integer, Customer> h1, Customer c) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean validateMobNo(Long phn) {
		// TODO Auto-generated method stub
		Pattern pat = Pattern.compile("[6-9][0-9]{9}");
		Matcher mat = pat.matcher(String.valueOf(phn));
		return mat.matches();
		
	}
	@Override
	public boolean validateAmount(int amount) {
		// TODO Auto-generated method stub
		Pattern pat = Pattern.compile("[1-9][0-9.]{0,15}");
		Matcher mat = pat.matcher(String.valueOf(amount));
		return mat.matches();
		
	}

	

}
