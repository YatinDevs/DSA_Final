package Sorting;
import java.util.*;

public class BubbleSort { // Sinking Sort Algorithm
    
	public static void bubbleSort(int arr[],int n) {
	// Days : 1 2 3	4
		
		for(int i = n-1; i >= 0 ; i--) {
			for(int j = 1; j <= i;j++ ) {
				
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
