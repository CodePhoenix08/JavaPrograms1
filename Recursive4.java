package com;

public class Recursive4 {
	static int fact(int n) {
		if(n!=0) {
			return n* fact(n-1);
		}
		return 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(3));
	}

}
