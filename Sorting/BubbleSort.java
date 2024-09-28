package Sorting;
import java.util.*;

public class BubbleSort {
    
	public static void bubbleSort(int arr[],int n) {
		
		for(int i = n-1 ; i >= 0 ; i--) {
			// 6 5 4 3 2 1 0
			for(int j = 1 ; j <= i ; j++ ) { //  1 2 3 4 5 6
				
				if(arr[j-1] > arr[j]) {
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
				
			}
			
		}
	}
	
	public static void printArray(int arr[]) {
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String args[]) {
		
	     int arr[] = { 9, 4, 7, 6, 3, 1, 5 };
	     int n = arr.length;
	     
	     System.out.println("Before Sort: " + Arrays.toString(arr));
	     bubbleSort(arr,n);
	     System.out.println("After Sort: " + Arrays.toString(arr));
	}
}
