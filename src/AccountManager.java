import java.util.ArrayList;
import java.util.Scanner;

public class AccountManager {
	ArrayList<Account> accounts = new ArrayList<Account>(); // 계정을 여러 개 생성하기 위해 배열 선언
	Scanner input;
	
	AccountManager(Scanner input){
		this.input = input; // MenuManager 클래스에서 선언한 Scanner 객체를 가져옴.
	}
	
	public void CreateAccount() {
		Account account = new Account();
		System.out.print("userID : ");
		account.userId= input.next();
		System.out.print("name : ");
		account.name= input.next();
		System.out.print("email : ");
		account.email = input.next();
		System.out.print("phone number : ");
		account.phone = input.next();
		accounts.add(account); // 계정생성 후 배열에 추가
	}
	
	public void DeleteAccount() {
		System.out.print("userID : ");
		String userID = input.next();
		int index = -1;
		for(int i = 0; i<accounts.size(); i++) {
			if(accounts.get(i).userId.equals(userID)) { // 계정 일치여부 비교
				index = i;
				break; // 배열의 크기만큼 반복문 실행
			}
		}
		
		if(index >= 0) {
			accounts.remove(index); // index 번호의 배열 값 삭제
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
			Account account = accounts.get(i); // i값의 index를 가진 배열의 값을 가진 account 객체 생성
			if(account.userId.equals(userID)) { //계정 일치여부 비교
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
						account.userId = input.next(); // UserId 변경
					}
					
					else if(select == 2) {
						System.out.print("name : ");
						account.name = input.next(); //name 변경
					}
					
					else if (select == 3) {
						System.out.print("email : ");
						account.email = input.next(); // email 변경
					}
					
					else if (select == 4) {
						System.out.print("phone number : ");
						account.phone = input.next(); // phone number 변경
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
			accounts.get(i).printInfo(); //계정정보 출력
		}
	}
}
