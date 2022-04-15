package com;

public class PellSeries {

	public static void main(String[] args) {
		int n1=0;
		int n2=1;
		int n3;
		System.out.println(n1);
		System.out.println(n2);
		for(int i=3;i<=20;i++) {
			n3=n1+(n2*2);
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}
	}

}
