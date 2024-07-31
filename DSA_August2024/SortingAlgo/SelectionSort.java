package SortingAlgo;
import java.util.*;

public class SelectionSort {

	
	public static void printArray(int arr[]) {
		
		System.out.println(Arrays.toString(arr)); 
		
	}
	
	public static void selectionSort(int arr[]) {
		int n = arr.length;
		
		for(int i=0;i<n-1;i++) {
			int min = i;
			for(int j=i+1;j< n ; j++) {
				if(arr[j]<arr[min]) {
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr []= {7,5,9,2,8};
		System.out.println("Array Before Sorting : ");
		printArray(arr);
		selectionSort(arr);
		System.out.println("Array After Sorting : ");
		printArray(arr);

	}

}
