package Account;

import java.util.Scanner;

public class Account {

	protected AccountKind kind = AccountKind.normal;
	protected String userId;
	protected String name;
	protected String email;
	protected String phone;
	
	public Account() {
		
	}
	
	public Account(String userID, String name) {
		this.userId = userId;
		this.name = name;
	}
	
	public Account(String userId, String name, String email, String phone) {
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
	
	public AccountKind getKind() {
		return kind;
	}

	public void setKind(AccountKind kind) {
		this.kind = kind;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void getUserInput(Scanner input) {
		
		System.out.print("userID : ");
		String userId= input.next();
		this.setUserId(userId);
		
		System.out.print("name : ");
		String name= input.next();
		this.setName(name);
		
		System.out.print("email : ");
		String email = input.next();
		this.setEmail(email);
		
		System.out.print("phone number : ");
		String phone = input.next();
		this.setPhone(phone);
	}

	public void printInfo() {
		System.out.println("userId : " + userId + "\nname: " + name + "\nemail: " + email + "\nphone number: "+ phone);
	}
}
