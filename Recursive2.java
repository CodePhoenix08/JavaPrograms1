package com;

public class Recursive2 {
	static void Demo(int n) {
		if(n!=0) {
			System.out.println("Hello");
			Demo(n-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo(10);
	}

}
