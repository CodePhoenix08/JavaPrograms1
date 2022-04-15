package com;

public class MatrixPattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		int n=7;
				for(int i=0;i<n;i++) {
					for(int j=1;j<=n-i;j++) {
						System.out.print("* ");
					}
					System.out.println();
					}
				System.out.println("====================");
				for(int i=1;i<=n;i++) {
					for(int j=1;j<=n;j++) {
						if(i+j==n+1) {
							System.out.print("* ");
							break;
						}
						System.out.print("* ");
					}
					System.out.println();
					}
	}

}
