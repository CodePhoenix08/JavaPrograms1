package com;
public class ArrayPrimeSum {
	static int isPrimeNo(int n) {
		if(n==0||n==1) {
			return 0;
		}
		else {
			int flag=0;
			for(int i=2;i<=n/2;i++) {
				if(n%i==0) {
					flag=1;
				}
			}
			if(flag==0) {
				return n;
			}
			else {
				return 0;
			}
		}
	}
	public static void main(String[] args) {
		int arr[]= {1,3,7,22,34,9,13,5,12,7};
		int sum=0;
		for(int i=0;i<=arr.length-1;i++) {
			sum=sum+isPrimeNo(arr[i]);
		}
		System.out.println(sum);
	}

}
