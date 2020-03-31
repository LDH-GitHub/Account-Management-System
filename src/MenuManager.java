import java.util.Scanner;

public class MenuManager{
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int select = 5;
		
		while(true) {
			
			System.out.println("*** Account Management System Menu ***");
			System.out.printf("%26s\n","1.Add Account");
			System.out.printf("%29s\n","2.Delete Account");
			System.out.printf("%27s\n","3.Edit Account");
			System.out.printf("%32s\n","4.View Account List");
			System.out.printf("%29s\n","5.Show Main Menu");
			System.out.printf("%19s\n","6.Exit");
			System.out.println("Enter One Number Between 1 - 6 : ");
			
			select = input.nextInt();
			
			if (select == 1) {
				AddAccount();
			}
			else if (select == 2) {
				DeleteAccount();
			}
			else if (select == 3) {
				EditAccount();
			}
			else if (select == 4) {
				ViewAccount();
			}
			
			else if (select == 5)
				continue;
			else
				break;
		}
		
	}
	
	public static void AddAccount() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Account Number : ");
		String AccountNumber = input.nextLine();
		System.out.println("Account Registration Completed!");
		
	}
	
	public static void DeleteAccount() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Account Number : ");
		String AccountNumber = input.nextLine();
		System.out.println("Account Deletion Completed!");
		
	}
	
	public static void EditAccount() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Account Numbert : ");
		String AccountNumber = input.nextLine();
		System.out.println("A New Account Number : ");
		System.out.println("Account Modification Completed!");
		
	}
	
	public static void ViewAccount() {
		
		System.out.println("*** Current Account List ***");
		
	}
}