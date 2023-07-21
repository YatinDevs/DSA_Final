package Questions;

import java.util.*;
public class MergeTwoSortedArray {
      

	public static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
	}

	// Q . Merge Two Sorted Array.
	public static int [] merge(int arr[],int arr2[],int n,int m) {
		int temp[]=new int[n+m];
		int i=0;int j=0;int k=0;
		
		while(i<n && j <m) {
		   if(arr[i]<arr2[j]) {
			   temp[k]=arr[i];
			   i++;
		   }else {
			   temp[k]=arr2[j];
			   j++;
		   }
		   k++;
		}
		
		while(i<n) {
	        temp[k]=arr[i];
	        i++;
	        k++;
		}
		
		while(j<n) {
	        temp[k]=arr2[j];
	        j++;
	        k++;
		}
		return temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int arr[] = {3,5,7,11};
           int arr2[]= {4,6,9,13};
           int result[] = merge(arr, arr2, arr.length, arr2.length);
           printArray(result);
	}

}
