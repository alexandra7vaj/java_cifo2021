package wordsoperations;

import java.util.ArrayList;

public class AccountManagment {
	// scope #3

	
	public static ArrayList<String> createAccount(ArrayList<String> account) {
		// scope #4

		String user = AccountCreation.createUser(account.get(0));
		account.add(user);
		
		String email = AccountCreation.createEmail(account.get(0));
		account.add(email);
		
		String password = AccountCreation.createPassword();
		account.add(password);
		
		AccountCreation.printUserAccount(user, email, password);
		
		
		
		return account;
		
	}

}