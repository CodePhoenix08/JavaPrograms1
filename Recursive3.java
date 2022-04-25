package com;

public class Recursive3 {
	static int Demo(int n) {
		if(n<=3) {
			return n+Demo(n+1);
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Demo(1));

	}

}
