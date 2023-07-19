package SortingAlgo;
import java.util.*;

public class BubbleSort {
	
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
    
	public static void bubbleSort(int arr[])
	{
		int n=arr.length;
		
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {
				 if(arr[j+1]<arr[j]) {
					  swap(arr, j+1, j);
				 }
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
             int arr[]= {20,2,17,5,11,8};
     		System.out.println("Before Sorting : ");
             printArray(arr);
             
             bubbleSort(arr);
             
     		System.out.println("After Sorting : ");
            printArray(arr);

             
             
	}

}
