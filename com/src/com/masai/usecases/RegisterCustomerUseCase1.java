package com.masai.usecases;

import java.util.Scanner;

import com.masai.Dao.CustomerDao;
import com.masai.Dao.CustomerImpl;

public class RegisterCustomerUseCase1 {

	public static void main1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter username...");
		String username = sc.nextLine();

		System.out.println("Enter Mobile Number...");
		String mobile = sc.nextLine();

		System.out.println("Enter Strong Password");
		String password = sc.nextLine();
		boolean flag=true;
		while(flag) {
			
			System.out.println("Enter minimum balance to open account 10rs...");
			int Balance = sc.nextInt();
			if(Balance>=10) {
				
				CustomerDao cdao = new CustomerImpl();
				String message = cdao.registerCustomer(username, password, mobile,Balance);
				
				System.out.println(message);
				flag=false;
				
			}
		}
		
		
		
	}

}
