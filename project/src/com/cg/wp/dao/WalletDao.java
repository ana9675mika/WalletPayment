package com.cg.wp.dao;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.cg.wp.bean.Customer;
import com.cg.wp.bean.Wallet;
import com.cg.wp.exception.WalletException;

public class WalletDao implements IWRepo{

	public HashMap<Integer,Customer> h1=new HashMap();
	int walletId=1;
	@Override
	public Map createAccount(Customer c) throws WalletException {
		// TODO Auto-generated method stub
		ArrayList<Customer> al=new ArrayList();
		al.add(c);
		for(int i=0;i<al.size();i++)
		{
			h1.put(walletId, al.get(i));
			walletId++;
		}
		return h1;
		
	}
	public void show()
	{

		for(Integer i:h1.keySet())
		{
		String key=i.toString();
		String value=h1.get(i).toString();
		System.out.println(key+" "+value);
		}
	}


	@Override
	public void showBalance(HashMap<Integer,Customer> h1) throws WalletException {
		// TODO Auto-generated method stub
		Wallet link=null;
		long cd2=0;
		int key2=0;
		for(Integer key1:h1.keySet())
		{
			Customer cd1=h1.get(key1);
			link=cd1.getWallet();
			cd2=cd1.getAmount();
			key2=key1;
			
		}
		Long count=h1.get(key2).getPhn();
		System.out.println("Balance of "+h1.get(key2).getName()+" is "+cd2);
	
		
		
	}
	@Override
	public void deposit(HashMap<Integer,Customer> h1,Customer c) {
		// TODO Auto-generated method stub
		Wallet link=null;
		long cd2=0;
		int key2=0;
		int bal=0;
		for(Integer key1:h1.keySet())
		{
			Customer cd1=h1.get(key1);
			link=cd1.getWallet();
			cd2=link.getAccno();
			key2=key1;
			
		}
		bal=h1.get(key2).getWallet().getBalance();
		int total=bal+c.getAmount();
		System.out.println("total Balance of "+h1.get(key2).getName()+" is "+total);
	
		}
	@Override
	public void withdraw(HashMap<Integer,Customer> h1,Customer c) {
		// TODO Auto-generated method stub
		Wallet link=null;
		long cd2=0;
		int key2=0;
		int bal=0;
		for(Integer key1:h1.keySet())
		{
			Customer cd1=h1.get(key1);
			link=cd1.getWallet();
			cd2=link.getAccno();
			key2=key1;
			
		}
		bal=h1.get(key2).getWallet().getBalance();
		int total=bal-c.getAmount();
		System.out.println("total Balance after withdrawl of "+h1.get(key2).getName()+" is "+total);
	
	}
	
	
	
}
