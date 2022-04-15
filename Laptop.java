package com;

import java.util.Scanner;

public class Laptop {
	double prize;
	String brand;
		Laptop(double arg1,String arg2){
			prize=arg1;
			brand=arg2;	
		}
		void display() {
			System.out.println("brand : "+brand+" Prize :"+prize);
		}

	public static void main(String[] args) {
	Scanner ip =new Scanner(System.in);
	System.out.println("brand name : ");
	String s=ip.nextLine();
	System.out.println("Prize : ");
	double d=ip.nextDouble();
	Laptop l1=new Laptop(d,s);
	l1.display();

	}

}
