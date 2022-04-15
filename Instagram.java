package com;
public class Instagram {
	static void login(long ph_no,String pswd) {
		if(ph_no==8888888888l && pswd.equals("007@bond")) {
			System.out.println("login successfull");
		}
		else {
			System.out.println("invalid credentials");
		}
		
	}
	static void login(String email,String pswd) {
		if(email.equals("007@bond.com") && pswd.equals("007@bond")) {
			System.out.println("login successfull");
		}
		else {
			System.out.println("invalid credentials");
		}	
		}

	public static void main(String[] args) {
		login(8888888888l,"007@bond");
		login("007@bond.com","007@bond");

	}

}
