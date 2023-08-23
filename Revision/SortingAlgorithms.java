package Revision;
import java.util.*;

public class SortingAlgorithms {
	
	public static void swap(int arr[],int i,int j) {
		int temp= arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	public static void printArray(int arr[]) {
		
		System.out.print("[");
		for(int i=0;i<arr.length;i++) {
			if(i<arr.length-1) {
			System.out.print(arr[i]+",");
			}else {
				System.out.print(arr[i]);
			}
			
		}
		System.out.print("]");
		System.out.println("");


	}
	public static int linearSearch(int arr[],int target) {
		 
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]==target) {
				 return i;
			 }
			 
		 }
		 return -1;
	}
	
	
	// Sinking Sort Sinks Larger Elements at End of Array.
	public static void bubbleSort(int arr[]) {
		
		int n = arr.length;
		                      // 9  3  -1 4 2 7
		                 
		for(int i=0;i<n-1;i++) {   
			for(int j=0;j<n-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					swap(arr, j, j+1);
				}
			}
		}
	}

	
	// Binary Search  of Sorted Array in O(log n).
	
	public static int binarySearch(int arr[],int target) {
		int start = 0;
		int end = arr.length-1;
		while(start<=end) {
			 int mid = start + (end - start)/2;
			 
			 if(arr[mid]==target) {
				 return mid;
			 }
			 
			 if(target < arr[mid]) {
				 end = mid - 1;
			 }else {
				 start = mid + 1;
			 }
		}
		return -1;
	}
	
	/* Selection Sort*/
	
	public static void selectionSort(int arr[]) {
		int n = arr.length;
		
		for(int i=0;i<n;i++) {
			int min = i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[min]) {
					 min = j;
				}
			}
			swap(arr, min, i);		
		}
	}
	
	/* Insertion Sort */
	public static void insertionSort(int arr[]){
		 int n  = arr.length;
		 
		 for(int i=1;i<n;i++) {
			 int j=i-1;
			 int temp = arr[i];
			 while(j>=0 && arr[j]>temp) {
				  arr[j+1]=arr[j];
				  j--;
			 }
			 arr[j+1]=temp;	 
		 }
	}
	
	/* QuickSort */
	public static int partition(int arr[],int low,int high) {
		int pivot = arr[high];
		int i = low;
		int j = low;
		
		//  i  to high ---- > to be  iteration arr[i] > pivot or arr[i]<= pivot.
		//  low to j-1 --> smaller or equal than pivot  
		//  j to i-1 --> equal or greater element to pivot
		while(i<=high) {
			if(arr[i]<=pivot) {
				swap(arr, i, j);
				j++;
			}
			i++;
		}
		return j-1;
	}
	public static void quickSort(int arr[],int low,int high) {
		 if(low<high) {
			  int p = partition(arr,low,high);
			  quickSort(arr, low ,p-1);
			  quickSort(arr, p+1, high);

		 }
	}
	
    public static void sort(int arr[],int temp[],int low,int high){
		if(low<high) {  
		int mid = low + (high - low)/2;
		
		sort(arr,temp, low, mid);
		sort(arr,temp, mid+1, high);
		
		merge(arr,temp,low,mid,high);
		
		}
		
	}
    public static void merge(int arr[],int temp[],int low,int mid,int high){
    	for(int i=low;i<=high;i++) {
    		temp[i]=arr[i];
    	}

        int i=low;
        int j=mid+1;
        int k=low;
        while(i<=mid && j<=high) {
        	 if(temp[i]<temp[j]) {
        		 arr[k]=temp[i];
        		 i++;
        	 }else {
        		 arr[k]=temp[j];
        		 j++;
        	 }
        	 k++;
        }
        while(i<=mid){
            arr[k]=temp[i];
            i++;
            k++;
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {9,3,-1,4,2,7,5};
		
		/* Linear Search */
//		int result = linearSearch(arr,3);
//	    System.out.println("index : "+ result + " & Value : " + arr[result]);
	    
	    printArray(arr);
	    
	    /* BubbleSort */
//	    bubbleSort(arr);
//	    printArray(arr);
//	    
	    /* Binary Search */
//	    int res = binarySearch(arr,7);
//	    System.out.println("index : "+ res + " & Value : " + arr[res]);
	    
	    /* Selection Sort */
//	    selectionSort(arr);
//	    printArray(arr);

		/* Insertion Sort */
//	    insertionSort(arr);
//	    printArray(arr);
	    
	    /* quickSort */
//	    quickSort(arr, 0,arr.length-1 );
//	    printArray(arr);
	    
	   sort(arr,new int [arr.length], 0, arr.length-1);
	    printArray(arr);


       
	}

}
