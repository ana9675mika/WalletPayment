package com.cg.wp.bean;

public class Wallet {

	private long accno;
	private int balance;
	
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	public long getAccno() {
		return accno;
	}
	public void setAccno(long accno) {
		this.accno = accno;
	}
	@Override
	public String toString() {
		return "accno=" + accno + ", balance=" + balance ;
		
	}
	public Wallet(int balance) {
		super();
		this.balance = balance;
	}
	public Wallet(long accno, int balance) {
		super();
		this.accno = accno;
		this.balance = balance;
	}
	
	
}
