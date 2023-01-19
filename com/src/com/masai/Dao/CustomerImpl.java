package com.masai.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.masai.DBUtil.DBUtil;

public class CustomerImpl implements CustomerDao{

	@Override
	public String registerCustomer(String username, String password, String mobile, int balance) {
		// TODO Auto-generated method stub
//		return null;
		String message = "Not inserted..";

		try (Connection conn = DBUtil.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("insert into customers values(?,?,?,?,?)");
			ps.setString(1, customer.getAccNo());
			ps.setString(2, customer.getUsername());
			ps.setString(3, customer.getPassword());
			ps.setString(4, customer.getMobile());
			ps.setInt(5, customer.getBalance());

			int x = ps.executeUpdate();
			if (x > 0) {
				message = "Customer Registered Successfully..!";
			}

		} catch (SQLException e) {
			message = e.getMessage();
		}

		return message;
	}

	@Override
	public String registerCustomer(Customer customer) {
//		// TODO Auto-generated method stub
//		return null;
	}

	@Override
	public Customer getCustomerByAcc(String accNo) throws CustomerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer loginCustomer(String username, String password) throws CustomerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void loginCustomer1(String username, String password) throws CustomerException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loginAccountant(String username, String password) throws AccountantException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Customer> getAllCustomersDetails() throws CustomerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateCustomersDetails(String accNo) throws CustomerException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeCustomerAccount(String accNo) throws CustomerException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void depositeMoney(int amount, String accno) throws CustomerException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdrawMoney(int amount, String accno) throws CustomerException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transferMoney(int amount, String accno, String racco) throws CustomerException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showAllTransactions() throws CustomerException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkTransactionHistory(String accno) {
		// TODO Auto-generated method stub
		
	}

}
