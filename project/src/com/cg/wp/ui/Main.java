package com.cg.wp.ui;

import java.util.Scanner;

import com.cg.wp.bean.Customer;
import com.cg.wp.bean.Wallet;
import com.cg.wp.dao.WalletDao;
import com.cg.wp.exception.WalletException;


public class Main {

	public static void main(String[] args) throws WalletException {
		// TODO Auto-generated method stub
	int option=0;
      Scanner sc=new Scanner(System.in);
      /*System.out.println("enter your name");
      String name=sc.next();
      System.out.println("enter your phn");
      Long phn=sc.nextLong();
      System.out.println("enter your amount");
      int amount=sc.nextInt();
      
      long accno=1000;
     int balance=0;
         accno++;
         balance=balance+amount;
         Wallet w=new Wallet(accno, balance);
     Customer c=new Customer(name, phn, amount, w);
     */
	WalletDao wd=new WalletDao();
	//wd.createAccount(c);
	//wd.show();
	//wd.showBalance(wd.h1);
	//wd.deposit(wd.h1, c);
	//wd.withdraw(wd.h1, c);

	do {
//		This is to display the menu
		System.out.println("1. create account");
		System.out.println("2. Show Balance");
		System.out.println("3. deposit");
		System.out.println("4. withdraw");
		System.out.println("5. exit");

		option = sc.nextInt();

		switch (option) {
		case 1:
			//Case1: is to take inputs from the user and to validate the user inputs
			System.out.println("enter your name");
		      String name=sc.next();
		      System.out.println("enter your phn");
		      Long phn=sc.nextLong();
		      System.out.println("enter your amount");
		      int amount=sc.nextInt();
		      long accno=1000;
		      int balance=0;
		          accno++;
		          balance=balance+amount;
		          Wallet w=new Wallet(accno, balance);
		      Customer c=new Customer(name, phn, amount, w);
			wd.createAccount(c);
			wd.show();
				break;

		case 2:
			
			wd.showBalance(wd.h1);
			
			break;
		/*case 3:
			
			 wd.deposit(wd.h1,c);
			
			break;
		case 4:
			
			wd.withdraw(wd.h1,c);
			
			break;
*/
		default:
		case 5:
			System.out.println("Exited...");
			break;
		}

	} while (option != 5);
	sc.close();
}
}

