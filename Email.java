package Frog_Emal_Password;

import java.util.Scanner;

public class Email {
	private String Email;
	
	private String Username;
	
	private String Server;
	
	private String Domain;
	
	private int indexAt;
	
	private int indexDot;
	
	public Email() {
		Scanner input = new Scanner (System.in);
		
		while(true) {
		
			System.out.println("Enter your email: ");
		
			Email = input.next();

			if((Email.indexOf('@') == -1 || Email.indexOf('.') == -1) || Email.indexOf('@') > Email.indexOf('.') ) {
				System.out.println("Wrong email. Try again!");
			}
			else {
				break;
			}
		}
	}
	
	public void Username() {
		indexAt = Email.indexOf('@');
		Username = Email.substring(0, indexAt);
		System.out.println("The username is: " + Username);
	}
	
	public void Server() {
		indexDot = Email.indexOf('.');
		Server = Email.substring(indexAt + 1, indexDot);
		System.out.println("The server is: " + Server);
	}
	
	public void Domain() {
		Domain = Email.substring(indexDot + 1);
		System.out.println("The domain is: " + Domain);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Email email = new Email();
		
		email.Username();
		
		email.Server();
		
		email.Domain();
	}

}
