package encapsulation;

class AccountInfo
{
	private String name;
	private String email;
	private long accountNumber;
	private int balance;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
public void display()
{
	System.out.println("Account holder name : " + getName() + "\nEmail Id : " + getEmail() + "\nA/c Number : " + getAccountNumber() + "\nBalance amount is : " + getBalance());
}
}

public class AccountDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AccountInfo info1 = new AccountInfo();
		
		info1.setName("preetham");
		info1.setEmail("preetham.setty34@gmail.com");
		info1.setAccountNumber(2012055323);
		info1.setBalance(25000);
		info1.display();
	}

}
