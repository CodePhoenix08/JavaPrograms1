package com;

public class StringUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="welcome";
		for(int i=0;i<=s.length()-1;i++) {
			int f=0;
			for(int j=0;j<=s.length()-1;j++) {
				if(i!=j && s.charAt(i)==s.charAt(j)) {
					f=1;
					break;
				}
			}
			if(f==0) {
				System.out.print(s.charAt(i));
			}
		}
		
		
	}

}
