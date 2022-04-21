package com;

public class ArrayofChar2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hi welcome";
		char arr[]=s.toCharArray();
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[i]>arr[j]) {
					char temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(char c:arr) {
			System.out.print(c);
		}

	}

}
