package Frog_Emal_Password;

import java.util.Scanner;

public class Password {
	
	private int yearOfEmployment;
	private String name;
	private String[] namePart;
	private String userName;
	private String password;
	private String firstName;
	private String lastName;
	
	 public void Year() {
	        Scanner input = new Scanner(System.in);
	        while (true) {
	        	System.out.println("Enter the year of employment: ");
	        		if (input.hasNextInt()) {
	        			yearOfEmployment = input.nextInt();
	        			break;
	        		} else {
	        			System.out.println("Invalid input. Try again!");
	        			input.next();
	        		}
	        	}
	        System.out.println("The year of employment is: " + yearOfEmployment);
	    }

	    public void Name() {
	        Scanner input = new Scanner(System.in);
	        while (true) {
	        	System.out.println("Enter the full name: ");
	        	name = input.nextLine();
		        namePart = name.split(" ");
		            if (namePart.length >= 2) {
		                break;
		            } else {
		                System.out.println("Invalid input. Try again!");
		            }
		     }
	        System.out.println("The name is: " + name);
	    }

	    public void FirstName() {
	        firstName = namePart[0];
	        System.out.println("The first name is: " + firstName);
	    }

	    public void LastName() {
	        if (namePart.length >= 2) {
	            lastName = namePart[namePart.length - 1];
	        }
	        System.out.println("The last name is: " + lastName);
	    }

	    public void UserName() {
	        userName = firstName.substring(0, 1) + lastName.substring(0);
	        System.out.println("The username is: " + userName);
	    }

	    public void Password() {
	    	
	    	String year = String.valueOf(yearOfEmployment);
			if(lastName.length() < 3 && firstName.length() >= 3) {
				password = (firstName.substring(0, 3) + year + lastName.substring(0, lastName.length()));
			}
			else if(firstName.length() < 3 && lastName.length() >= 3) {
				password = (firstName.substring(0, firstName.length()) + year + lastName.substring(0, 3));
			}
			else if(firstName.length() < 3 && lastName.length() < 3) {
				password = (firstName.substring(0, firstName.length()) + year + lastName.substring(0, lastName.length()));
			}
			else {	
				password = (firstName.substring(0, 3) + year + lastName.substring(0, 3));
			}
			System.out.println("The password is: " + password);
	    }

	    public static void main(String[] args) {
	        Password passwordCreator = new Password();

	        passwordCreator.Name();
	        passwordCreator.Year();
	        passwordCreator.FirstName();
	        passwordCreator.LastName();
	        passwordCreator.UserName();
	        passwordCreator.Password();
	    }
	}
