public class Account {
	String userId;
	String name;
	String email;
	String phone;
	
	public Account() {
		
	}
	
	public Account(String userId, String name, String email, String phone) {
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
	
	public void printInfo() {
		System.out.println("userId : " + userId + "\nname: " + name + "\nemail: " + email + "\nphone number: "+ phone);
	}
}
