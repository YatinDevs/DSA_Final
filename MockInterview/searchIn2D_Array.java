package MockInterview;
import java.util.*;
public class searchIn2D_Array {

	// Write a program to search a key in a given matrix.
	public static void searchKey(int arr[][],int key) {
		
		int n = arr.length;

		for(int i = 0;i<n;i++) {
			for(int j = 0; j<n ; j++) {
				 if(arr[i][j] == key) {
				     System.out.println("Index :"+"[" + i +"]"+"["+j+"]"+" : " + " Value :"+"["+key +"]");
				 }
			}

		}
	}
	// More OptimiZed way to Search a Key .
	
	public static void searchin2D(int arr[][],int key) {
		
		 int i = 0;
		 int j = arr.length-1;
		 int n = arr.length;
		 
		 
		 while(i < n && j >= 0) {
			 
			 if(arr[i][j]==key) {
			     System.out.println("Index :"+"[" + i +"]"+"["+j+"]"+" : " + " Value :"+"["+key +"]");
			     return;
			 }else if(arr[i][j]>key) {
				 j--;
			 }else {
				 i++;
			 }
			 
		 }
		 
	}
	
	
	
	public static  int binarySearch(int arr[],int key) {
		int low = 0;
		int high = arr.length-1;
		
		while(low<=high) {
			
			int mid = low + (high-low)/2;
			
			if(arr[mid]== key) {
				return mid;
			}
			if(key < arr[mid]) {
				high = mid - 1 ;
				
			}else {
				low = mid + 1;
				
			}
		}
		
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		int matrix[][] = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}};
		
		searchKey(matrix, 11);
		searchin2D(matrix,14);
		 System.out.println(	binarySearch(arr,4));

	}

}
