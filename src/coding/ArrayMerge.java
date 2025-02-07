package coding;

import java.util.Arrays;
import java.util.Scanner;



public class ArrayMerge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n;
		int m;
		int x;
		n=sc.nextInt();
		m=sc.nextInt();
		x=n+m;
		int arr1[]=new int[n];
		int arr2[]=new int[m];
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
		}
		
		for(int i=0;i<m;i++) {
			arr2[i]=sc.nextInt();
		}
		
		int arr[]=new int[x];
		
		for(int i=0;i<n;i++) {
			arr[i]=arr1[i];
		}
		
		for(int i=0;i<m;i++) {
			arr[n+i]=arr2[i];
		}
        

		
		//Arrays.sort(arr);
		
		for(int i=0;i<x;i++) {
			
			for(int j=i+1;j<x;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		
		}
		
		for(int i=0;i<x;i++) {
			System.out.print(arr[i] +" ");
		}
		
		
	}

}
