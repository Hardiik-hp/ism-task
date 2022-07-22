package java.Task15;

import java.util.Scanner;

public class Google {
	public static void main(String[] args) {
		String email;
		
		try (Scanner snr = new Scanner(System.in)) {
			System.out.println("Enter Email");
			try {
				email = snr.next();
				if(email.contains("@") && email.endsWith("gmail.com") ) {
					System.out.println(email);
				}else {
					
					throw  new InvalidEmailException("Invalid Email");
				}
			} catch (InvalidEmailException e) {
				System.out.println(e);
			}
		}
	}
}

class InvalidEmailException extends Exception{
	public InvalidEmailException(String s) {
		super(s);
	}	
}