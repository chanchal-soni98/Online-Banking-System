package OBS;

import java.util.Scanner;

import com.masai.Dao.CustomerDao;
import com.masai.Dao.CustomerImpl;
import com.masai.exceptions.AccountantException;
import com.masai.exceptions.CustomerException;
import com.masai.usecases.RegisterCustomerUseCase2;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while (flag) {

		System.out.println("=====================================\n"
				+ "Welcome to the Online Banking System:"+"\n"
				+"=====================================");
		System.out.println("Choose the following Option:"+"\n"+"---------------------------------");
		System.out.println("1.Log in as a Accountat");
		System.out.println("2.Log in as a Customer");
		System.out.println("3.New Customer? Please Register..!");
		System.out.println("4.Exit"+"\n"+"---------------------------------");
			try {
				int choice = sc.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Enter your username:");
					String acUsername = sc.next();
					System.out.println("Enter your password:");
					String acPassword = sc.next();

					CustomerDao cdao = new CustomerImpl();
					try {
						cdao.loginAccountant(acUsername, acPassword);

					} catch (AccountantException ae) {
						System.out.println(ae.getMessage());
					}

					break;
				case 2:
					System.out.println("Enter username:");
					String cUsername = sc.next();
					System.out.println("Enter password:");
					String cPassword = sc.next();

					CustomerDao cdao1 = new CustomerImpl();
					try {

						cdao1.loginCustomer1(cUsername, cPassword);

					} catch (CustomerException ce) {
						System.out.println(ce.getMessage());
					}
					break;
				case 3:
					RegisterCustomerUseCase2.main1();

					break;
				case 4:
					flag = false;
					break;
				default:
					System.out.println("Invalid Entry...Please enter valid option 1,2 or 4");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}
	}

}