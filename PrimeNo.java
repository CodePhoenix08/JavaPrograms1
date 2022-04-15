package com;
public class PrimeNo {
	public static void main(String[] args) {	
		int n=13;
		if(n==0||n==1) {
			System.out.println("its not a prime no");
		}
		else if(n==2) {
			System.out.println("its a prime no");
		}
		else {
			int flag=0;
			for(int i=2;i<n/2;i++) {
				if(n%i==0) {
					flag=1;
					break;
				}
			}
			if(flag==0) {
				System.out.println("prime no number");
			}
			else {
				System.out.println("not a prime number");
			}
			
		}

	}

}
