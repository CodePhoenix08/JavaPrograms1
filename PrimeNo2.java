package com;

public class PrimeNo2 {

	public static void main(String[] args) {
	
		int n=7;
		int count=0;
		for(int i=1;i<=n;i++) {//for(int i=1;i<n/2;i++)
			if(n%i==0) {
				System.out.println(n+" is divided by "+i);
				count++;
			}
		}
		if(count==2) {  //if(count==1)
			
			System.out.println("its a prime no");
		}
		else {
			System.out.println("not a prime no");
		}

	}

}
