package com;

public class StringConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//upper case to lower case
		String s1="HELLO";
		String s2="";
		for(int i=0;i<=s1.length()-1;i++) {
			char v= s1.charAt(i);
			v= (char) (v+32);
			s2=s2+v;
		}
		System.out.println(s2);
		
		//lower case to upper case
		String s3="hello";
		String s4="";
		for(int i=0;i<=s1.length()-1;i++) {
			char v= s1.charAt(i);
			v= (char) (v-32);
			s2=s2+v;
		}
		System.out.println(s2);
		
	}

}
