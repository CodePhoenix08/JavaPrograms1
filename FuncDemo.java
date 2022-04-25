package com;

public class FuncDemo {
	static void Hello() {
		System.out.println("hello hi");
		
	}
	static void Hi() {
		Hello();
	}
	public static void main(String[] args) {
		Hi();
	}
}
