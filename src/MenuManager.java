import java.util.Scanner;

public class MenuManager{
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		AccountManager accountManager = new AccountManager(input);
		
		while(true) {
			System.out.println("*** Account Management System Menu ***");
			System.out.printf("%26s\n","1.Add Account");
			System.out.printf("%29s\n","2.Delete Account");
			System.out.printf("%27s\n","3.Edit Account");
			System.out.printf("%33s\n","4.View Accounts List");
			System.out.printf("%19s\n","5.Exit");
			System.out.println("Enter One Number Between 1 - 5 : ");
			
			int select = input.nextInt();
			
			if (select == 1) {
				accountManager.CreateAccount();
			}
			else if (select == 2) {
				accountManager.DeleteAccount();
			}
			else if (select == 3) {
				accountManager.EditAccount();
			}
			else if (select == 4) {
				accountManager.ViewAccounts();
			}
			else if (select == 5) {
				break;
			}
			else {
				System.out.println("Error! Please enter a number between 1 and 5!");
				continue;
			}
		}
	}
}