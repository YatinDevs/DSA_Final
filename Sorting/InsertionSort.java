package Sorting;
import java.util.*;

public class InsertionSort {
    
    public static void insertionSort(int arr[],int n) {
    	
    	for(int i = 0;i < n;i++ ) {
    		
    		int j = i;
    		
    		while(j > 0 && arr[j] < arr[j-1]) {
    			
    			int temp = arr[j-1];
    			arr[j-1] = arr[j];
    			arr[j] = temp;
    		    j--;	
    		}
    	}
    }
    
	public static void main(String arg[]) {
		
		
		 int arr[] = { 9, 4, 7, 6, 3, 1, 2 };
	     int n = arr.length;
	     
	     System.out.println("Before Sort: " + Arrays.toString(arr));
	     insertionSort(arr,n);
	     System.out.println("After Sort: " + Arrays.toString(arr));
	}
}
