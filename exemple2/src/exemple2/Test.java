package exemple2;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		  Scanner reader = new Scanner (System.in);
		  System.out.println("Tell me your user name:");
		  String userName = reader.nextLine();
		  
		  System.out.println("Tell me you type of user:");
		  String userType = reader.nextLine();
		  
		  System.out.println("Tell me the amount of your buy:");
		  int userBuy = reader.nextInt();
		  
		  System.out.println("\nUser:");
			System.out.println("-------------------------\n");
			System.out.println("User Name: " + userName );
			System.out.println("User Type: " + userType );
			System.out.println("User Buy: " + userBuy );
		  
	}

}
