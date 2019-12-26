package login.submit.registration;

public interface CustomerDOA {

	public int insertCustomer(Customer c);
	public Customer getCustomer(String username, String pass);
}
