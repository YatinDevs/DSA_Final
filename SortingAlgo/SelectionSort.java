package SortingAlgo;
import java.util.*;

public class SelectionSort {

	public static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
	}

	
	public static void swap(int arr[],int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	public static void selectionSort(int arr[]) {
		int n=arr.length;
		
		for(int i=0;i<n;i++) {
			int min=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			swap(arr, i, min);
		}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int arr[]= {20,2,14,5,11,9};
   		System.out.println("Before Sorting : ");
           printArray(arr);
           
           selectionSort(arr);
           
   		System.out.println("After Sorting : ");
          printArray(arr);
	}

}
