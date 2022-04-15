package com;
import java.util.Scanner;
public class Scan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		//Scanner ip2=new Scanner(System.in);
		System.out.println("enter a int input ");
		int a=ip.nextInt();
		ip.nextLine();
		System.out.println("enter a string sentence");
		String s=ip.nextLine();
		System.out.println("int "+a);
		System.out.println("String "+s);
	}

}
