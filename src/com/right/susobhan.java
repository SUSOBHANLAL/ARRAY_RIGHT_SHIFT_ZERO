package com.right;

public class susobhan {
	public static void main (String args[]) {
		int arr[]= {2,5,4,5,6,0,0,0,0,0,2,1,5,8,9,10};
		
		int arr2[]= new int [23];
		int n= arr.length;
		int j= 0;
		for(int i =0;i<n;i++) {
			if(arr[i]!=0)
			{
				arr2[j]=arr[i];
				j++;
				
			}
		}
		for(int i =0;i<n;i++) {
			System.out.print(arr2[i]+" ");
		}
	}

}
