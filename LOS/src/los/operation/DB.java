package los.operation;

import java.util.ArrayList;

import los.customer.Customer;
import los.customer.PersonalInformation;

public interface DB {

	public static ArrayList<Customer> getNegativeCustomer() {
		
		ArrayList<Customer> negativeCustomers=new ArrayList<>();
		Customer customer=new Customer();
		customer.setId(1010);
		PersonalInformation pd=new PersonalInformation();
		pd.setFirstName("tim");
		pd.setLastName("jackson");
		pd.setPhone("2222");
		pd.setPanCard("BW1000");
		pd.setVoterId("A111");
		pd.setEmail("tim@gmail.com");
		pd.setAge(24);
		customer.setPersonal(pd);
		negativeCustomers.add(customer);
		customer=new Customer();
		customer.setId(1010);
		pd=new PersonalInformation();
		pd.setFirstName("tom");
		pd.setLastName("dahl");
		pd.setPhone("3333");
		pd.setPanCard("BW2000");
		pd.setVoterId("A222");
		pd.setEmail("tom@gmail.com");
		pd.setAge(30);
		customer.setPersonal(pd);
		negativeCustomers.add(customer);
		return negativeCustomers;
		
	}
}
