package exemple2;

import java.util.Scanner;

public class Test {
	//scope number #1
	//public double vipClientDiscount = 25.00;
	//public double vipClientDiscount = 15.00;
	//public double vipClientDiscount = 00.00;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//scope number #2
   
		 while(true) {
			  //scope #6
			    Scanner reader = new Scanner(System.in);
				System.out.println("Tell me your user name:");
				String userName = reader.nextLine();

				System.out.println("Tell me your type of user:");
				String userType = reader.nextLine();

				System.out.println("Tell me the amount of your buy:");
				int userBuy = reader.nextInt();

				System.out.println("\nUser:");
				System.out.println("-------------------------\n");
				System.out.println("User Name: " + userName);
				System.out.println("User Type: " + userType);
				System.out.println("User Buy: " + userBuy); 
			
			if (userType.equals("vip")) {
				//scope number #3
				// i have to code 25% discount
			
				
				//scope number #9
				
				// print to screen
				System.out.println("\nTicket:");
				System.out.println("-------------------------\n");
				System.out.println("The amout of your buy is: " + userBuy);
				System.out.println("Your discout is: " + "25%" );
				System.out.println("Your total discout is:" + userBuy*25/100 );
				System.out.println("Your should pay (with the discount): " + (userBuy - (userBuy * 25 / 100)) + "\n");
			
			
			
			} else if(userType.equals("regular")) {	
				//scope number #7
				// i have to code 15% discount
				
				System.out.println("\nTicket:");
				System.out.println("-------------------------\n");
				System.out.println("The amout of your buy is: " + userBuy);
				System.out.println("Your discout is: " + "15%" );
				System.out.println("Your total discout is:" + userBuy*15/100 );
				System.out.println("Your should pay (with the discount): " + (userBuy - (userBuy * 15 / 100)) + "\n");
			}
			
			
					
			 else if (userType.equals("new")) {	
				//scope number #8
				// i have to code 0% discount
				
				System.out.println("\nTicket:");
				System.out.println("-------------------------\n");
				System.out.println("The amout of your buy is: " + userBuy);
				System.out.println("Your discout is: " + "0%" );
				System.out.println("Your total discout is:" + userBuy*0 );
				System.out.println("Your should pay (with the discount): " + (userBuy - (userBuy * 0)) + "\n");
			
			
		 
		 }
				// if (userType.equals("is Not a vip user")) {
			    //else if (userType.equals("is Not a vip user"))
			
				//scope number #4 
			   // I am closing the while so also the while scope
				
			
		 }			
			
	}		
	public static void methodtotestscope() { 
	    // scope number #5
	   // here i don't see variables from other scopes
	  // userName <<<i don't see this variables from scope #2
	 // userName <<<i don't see this variables from scope #3
	// userName <<<i don't see this variables from scope #4
	} 
	  
	}
