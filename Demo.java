package com;

public class Demo {

	public static void main(String[] args) {
	
		char c='8';
		if( (c>='A'&& c<='Z')||(c>='a'&& c<='z')) {
			System.out.println("alpha");
		}
		else if(c>='0' && c<='9') {
			System.out.println("number");
		}
		else {
			System.out.println("special character");
		}
	}

}
