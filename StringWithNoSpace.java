package com;

public class StringWithNoSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello hi bye           welcome";
		String s1="";
		for(int i=0;i<=s.length()-1;i++) {
			if(s.charAt(i)!=' ') {
				s1+=s.charAt(i);
			}
		}
		System.out.println(s1);
	}

}
