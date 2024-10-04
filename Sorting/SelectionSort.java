package Sorting;
import java.util.*;
public class SelectionSort {
	
	public static void selectionSort(int arr[],int n) {
	// Days: 1 2 3
		for(int i= 0;i<n;i++) {
			int  min = i;
			for(int j=i;j<n;j++) {
				if(arr[j] <= arr[min]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	      
	}
	
	public static void swap(int arr[],int i ,int j) {
		int temp = arr[j];
		arr[j] = arr[i];
	    arr[i] = temp;    
	}

	
	public static void printArray(int arr[]) {
	    System.out.println(Arrays.toString(arr));
	}
	
    public static void main(String args[]) {
    	
    	int arr[] = {13, 46, 24, 54, 20, 9};
    	int n = arr.length;
    	System.out.println("before"); 
    	printArray(arr);
    	selectionSort(arr,n);
    	System.out.println("after");
    	printArray(arr);
    

    	
    	
    }
}
