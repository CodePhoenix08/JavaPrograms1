package com;

public class SwitchDemo {

	public static void main(String[] args) {
		char op='+';//-,*,%,/
		int a=10;
		int b=20;
		switch(op) {
		case '+':System.out.println("add : "+(a+b));
					break;
					
		case '-':System.out.println("sub : "+(a-b));
					break;
		
		case '*':System.out.println("mul : "+(a*b));
					break;
		
		case '/':System.out.println("div : "+(a/b));
					break;
		 
		case '%':System.out.println("rem : "+(a%b));
					break;
		default : System.out.println("invalid choice");
		
		}

	}

}
