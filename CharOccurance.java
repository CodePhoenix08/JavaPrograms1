package com;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ABABCCABABBBBBB";
		int arr[]=new int[256];
		for(int i=0;i<s.length();i++) {
			arr[s.charAt(i)]++;
		}
		int max=0;
		char d=' ';
		for(int i=0;i<=255;i++) {
			if(arr[i]!=0) {
				if(arr[i]>=max) {
					d=(char)i;
					max=arr[i];
							
				}
			}
		}
		System.out.println(d+" "+max);
		

	}

}
