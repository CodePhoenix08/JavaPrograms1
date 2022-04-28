package com;

import java.util.Scanner;

public class StringAnagram {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("enter two strings to check whether they are anagram");
		String s1=ip.next();
		String s2=ip.next();
		if(s1.length()==s2.length()) {
			char arr1[]=s1.toCharArray();
			char arr2[]=s2.toCharArray();
			
			for(int i=0;i<arr1.length;i++) {
				for(int j=i;j<arr1.length;j++) {
					if(arr1[i]>arr1[j]) {
						char temp =arr1[i];
						arr1[i]=arr1[j];
						arr1[j]=temp;
					}

					if(arr2[i]>arr2[j]) {
						char temp =arr2[i];
						arr2[i]=arr2[j];
						arr2[j]=temp;
					}
				}}
	
			String s3="";
			for(char i:arr1) {
				s3+=i;
			}
			String s4="";
			
			for(char j:arr2) {
				s4+=j;
			}
			if(s3.equals(s4)) {
				System.out.println("its anagram strings");
			}
			else {
				System.out.println("not a anagram");
			}
			
			
		}
		else {
			System.out.println("strings are not equal");
		}
		
	}

}
