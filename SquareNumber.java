package com;

public class SquareNumber {

	public static void main(String[] args) {
		int n=16;
		int flag=0;
		int i=1;
		do {
			if(i*i==n) {
				flag=1;
			}
			i++;
		}while(i<=n/2);
		
		if(flag==1) {
			System.out.println("perfect square no");
		}
		else {
			System.out.println("not a perfect square no");
		}

	}

}
