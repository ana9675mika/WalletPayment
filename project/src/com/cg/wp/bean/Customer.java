package com.cg.wp.bean;

public class Customer {

	private String name;
	private Long phn;
	private int amount;
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	private Wallet wallet;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getPhn() {
		return phn;
	}
	public void setPhn(Long phn) {
		this.phn = phn;
	}
	public Wallet getWallet() {
		return wallet;
	}
	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}
	
	public Customer(String name, Long phn, int amount, Wallet wallet) {
		super();
		this.name = name;
		this.phn = phn;
		this.amount = amount;
		this.wallet = wallet;
	}

	
	@Override
	public String toString() {
		return "name=" + name + ", phn=" + phn + ", amount=" + amount + ", " + wallet ;
	}
	
}
