package com;

public class ContinueDemo {

	public static void main(String[] args) {
		System.out.println("prgm started ");
		for(int i=1;i<=10;i++) {
			
			if(i==5||i==7) {
				continue;
			}
			else if (i==7|| i==9){
				break;
			}
			System.out.println(i);
		}
		System.out.println("prgm ended");

	}

}
