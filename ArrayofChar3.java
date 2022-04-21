package com;

public class ArrayofChar3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello & hi $ welcome";
		int size=0;
		for(int i=0;i<=s.length()-1 ;i++) {
			if(s.charAt(i)>='a'&&s.charAt(i)<='z') {
			size++;
		}}
		char arr[]=new char[size];
		int k=0;
		for(int i=0;i<=s.length()-1 ;i++) {
			if(s.charAt(i)>='a'&&s.charAt(i)<='z') {
			arr[k]=s.charAt(i);
			k++;
		}}
		for(char c:arr) {
			System.out.print(c);
		}
	}

}
