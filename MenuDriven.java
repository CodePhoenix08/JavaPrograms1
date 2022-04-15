package com;

import java.util.Scanner;

public class MenuDriven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		System.out.println("1.Add \n2.Sub \n3.Div \n4.Mul \n5.Mod");
		System.out.println("plz give a choice : ");
		int Choice=ip.nextInt();
		System.out.println("enter number n1 : ");
		int n1=ip.nextInt();
		System.out.println("enter number n2 : ");
		int n2=ip.nextInt();
		switch(Choice) {
		case 1: System.out.println("Add : "+(n1+n2));
				break;
		case 2: System.out.println("sub : "+(n1-n2));
				break;
		case 3: System.out.println("div : "+(n1/n2));
				break;
		case 4: System.out.println("mul : "+(n1*n2));
				break;
		case 5: System.out.println("mod : "+(n1%n2));
				break;
		default : System.out.println(" idiot get out");
		}
		
		
	}

}
