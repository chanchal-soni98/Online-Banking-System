package com.masai.usecases;

import java.util.Scanner;

import com.masai.Dao.CustomerDao;
import com.masai.Dao.CustomerImpl;
import com.masai.bean.Customer;
import com.masai.exceptions.CustomerException;

public class LoginUseCase {
	
	public static void main1() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter username...");
		String username = sc.nextLine();

		System.out.println("Enter password...");
		String password = sc.nextLine();

		CustomerDao cdao = new CustomerImpl();
		 try {
			Customer customer = cdao.loginCustomer(username, password);
			System.out.println("log in Successfull\nWelcome, "+customer.getUsername());
		} catch (CustomerException ce) {
			System.out.println(ce.getMessage());
		}

	}

}
