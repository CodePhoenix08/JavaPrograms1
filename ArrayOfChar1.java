package com;

public class ArrayOfChar1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Welcome";
		char arr[]=new char[s.length()];
		for(int i=0;i<=s.length()-1 ;i++) {
			arr[i]=s.charAt(i);
		}
		for(char c:arr) {
			System.out.println(c);
		}

	}

}
