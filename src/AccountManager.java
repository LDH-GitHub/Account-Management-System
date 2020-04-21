import java.util.ArrayList;
import java.util.Scanner;

import Account.Account;
import Account.RegularAccount;

public class AccountManager {
	ArrayList<Account> accounts = new ArrayList<Account>();
	Scanner input;
	
	AccountManager(Scanner input){
		this.input = input;
	}
	
	public void CreateAccount() {
		Account account;
		while(true) {
			System.out.println("1. for VIP : ");
			System.out.println("2. for Regular : ");
			System.out.println("3. for Normal : ");
			System.out.println("4. for New : ");
			System.out.println("5. Exit : ");
			int kind = input.nextInt();
			if (kind == 1) {
				account = new Account();
				account.getUserInput(input);
				accounts.add(account);
				break;
			}
			else if (kind == 2) {
				account = new RegularAccount();
				account.getUserInput(input);
				accounts.add(account);
				break;
			}
		}
	}
	
	public void DeleteAccount() {
		System.out.print("userID : ");
		String userID = input.next();
		int index = -1;
		for(int i = 0; i<accounts.size(); i++) {
			if(accounts.get(i).getUserId().equals(userID)) {
				index = i;
				break;
			}
		}
		
		if(index >= 0) {
			accounts.remove(index);
			System.out.println(userID + " is deleted!");
		}
		else {
			System.out.println("This userId has not been registered!");
			return;
		}
	}
	
	public void EditAccount() {
		System.out.print("userId : ");
		String userID = input.next();
		for (int i = 0; i<accounts.size(); i++){
			Account account = accounts.get(i);
			if(account.getUserId().equals(userID)) {
				while(true) {
					System.out.println("*** Account Edit Menu ***");
					System.out.println("1. Edit UserID");
					System.out.println("2. Edit Name");
					System.out.println("3. Edit Email");
					System.out.println("4. Edit Phone Number");
					System.out.println("5. Exit");
					System.out.println("Enter One Number Between 1 - 5 : ");
					
					int select = input.nextInt();
					
					if (select == 1) {
						System.out.print("UserId : ");
						String userId = input.next();
						account.setUserId(userId);
					}
					
					else if(select == 2) {
						System.out.print("name : ");
						String name = input.next();
						account.setName(name);
					}
					
					else if (select == 3) {
						System.out.print("email : ");
						String email = input.next();
						account.setEmail(email);
					}
					
					else if (select == 4) {
						System.out.print("phone number : ");
						String phone = input.next();
						account.setPhone(phone);
					}
					
					else if (select == 5){
						break;
					}
					
					else {
						System.out.println("Error! Please enter a number between 1 and 5!");
						continue;
					}
				}
			}
		}
	}

	public void ViewAccounts() {
		for(int i=0; i<accounts.size(); i++) {
			accounts.get(i).printInfo();
		}
	}
}
