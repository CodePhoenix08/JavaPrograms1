package com;

import java.util.Scanner;
public class TernaryOp {
	public static void main(String[] args) {
		
           Scanner ip = new Scanner(System.in);
           System.out.println("enter A number : ");
           int n=ip.nextInt();
           if (n%5==0 && n%3==0) {
        	   System.out.println(true);
           }
           else {
        	   System.out.println(false);
           }
           boolean ans=(n%5==0 && n%3==0)?true:false;
           System.out.println(ans);
           
	}

}
