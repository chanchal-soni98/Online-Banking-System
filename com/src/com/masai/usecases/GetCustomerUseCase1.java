package com.masai.usecases;

import java.util.Scanner;

import com.masai.Dao.CustomerDao;
import com.masai.Dao.CustomerImpl;
import com.masai.bean.Customer;
import com.masai.exceptions.CustomerException;

public class GetCustomerUseCase1 {
	public static void main1() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter acc number...");
		String acc = sc.nextLine();

		CustomerDao cdao = new CustomerImpl();

		Customer customer;
		try {
			customer = cdao.getCustomerByAcc(acc);

			System.out.println(customer);

		} catch (CustomerException ce) {

			System.out.println(ce.getMessage());

		}

	}

}
