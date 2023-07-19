package SortingAlgo;
import java.util.*;

public class InsertionSort {

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
	
	public static void insertionSort(int arr[]) {
		int n=arr.length;
		
		for(int i=1;i<n;i++) {
			int j=i-1;
			int temp=arr[i];
			while(j>=0 && arr[j]>temp) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int arr[]= {20,2,17,5,11,9};
   		System.out.println("Before Sorting : ");
           printArray(arr);
           
           insertionSort(arr);
           
   		System.out.println("After Sorting : ");
          printArray(arr);
	}

}
