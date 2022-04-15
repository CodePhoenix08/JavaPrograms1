package com;

import java.util.Scanner;

public class Fibonnaci {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("enter the range : ");
		int lr=ip.nextInt();
		int hr=ip.nextInt();
		int n1=0;
		int n2=1;
		int n3=1;
		if(lr==0) {
			System.out.println(n1);
			System.out.println(n2);
		}
		while((n1+n2)<hr) {
			n3=n1+n2;
			if(n3>=lr) {
			System.out.println(" "+n3);}
			n1=n2;
			n2=n3;
		}

	}

}
