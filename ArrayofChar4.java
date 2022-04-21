package com;

public class ArrayofChar4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello & hi $ welcome";
		String s1="";
		for(int i=0;i<=s.length()-1 ;i++) {
			if(s.charAt(i)>='a'&&s.charAt(i)<='z') {
			s1+=s.charAt(i);
		}}
		char arr[]=s1.toCharArray();
		for(char c:arr) {
			System.out.print(c);
		}
	}

}
