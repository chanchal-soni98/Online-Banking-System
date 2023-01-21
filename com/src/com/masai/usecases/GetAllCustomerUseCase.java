package com.masai.usecases;

import java.util.List;

import com.masai.Dao.CustomerDao;
import com.masai.Dao.CustomerImpl;
import com.masai.bean.Customer;
import com.masai.exceptions.CustomerException;

public class GetAllCustomerUseCase {
	
	public static void main1() {

		CustomerDao cdao = new CustomerImpl();
		try {
			List<Customer> custormersList = cdao.getAllCustomersDetails();
			custormersList.forEach(c -> System.out.println(c));

		} catch (CustomerException ce) {
			System.out.println(ce.getMessage());

		}

	}


}
