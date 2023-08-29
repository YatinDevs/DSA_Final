package RevisionDSA2;
import java.util.*;

public class SearchAndSortAlgorithms {
	
	public static void printArray(int arr[]) {
		
		System.out.print("[");
		for(int i=0;i<arr.length;i++) {
			if(i!=arr.length-1) {
			System.out.print(arr[i]+",");
			}else {
			System.out.print(arr[i]);
			}
		}
		System.out.print("]");	
		System.out.println("");
	}
	
	public static void swap(int arr[],int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static int linearSearch(int arr[],int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				return i;
			}
		}
	  return -1;
	}
	
	public static void bubbleSort(int arr[]) {
		int n = arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					swap(arr, j, j+1);
				}
			}
		}
	}
	
	public static void merge (int arr[],int temp[],int low,int mid,int high) {
		
		for(int i=low;i<=high;i++) {
			temp[i] = arr[i];
		}
		
		int i = low;
		int j = mid+1;
		int k = low;
		
		while(i <= mid && j <= high) {
			
			if(temp[i]<temp[j]) {
				arr[k] = temp[i];
				i++;
			}else {
				arr[k] = temp[j];
				j++;
			}
			k++;
		}
		while(i <= mid) {
			arr[k] = temp[i];
			i++;
			k++;
		}
		
	}
	
	public static int partition(int arr[],int low,int high) {
		
		int pivot = arr[high];
		int i = low;
		int j = low;
		
		while(i<=high) {
			  
			if(arr[i]<=pivot) {
				swap(arr, i, j);
				j++;
			}
			i++;
		}
		
		return j-1;
	}
	
	public static void quickSort(int arr[],int low, int high) {
		
		if(low<high) {
			int p = partition(arr,low,high);
			quickSort(arr, low,p-1);
			quickSort(arr, p+1, high);
		}
	}
	

	public static void mergeSort(int arr[],int temp[],int low,int high) {
		
		if(low < high) {
		     int mid = low + (high- low )/2;
		     mergeSort(arr, temp, low, mid);
		     mergeSort(arr, temp, mid+1, high);
		     merge(arr, temp, low, mid, high);
		}			
	}
    
	public static void selection(int arr[]) {
		int n = arr.length;
		
		for(int i=0;i<n;i++) {
			int min = i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[min]) {
					min = j;
				}
			}
			swap(arr, i, min);
		}
	}
	
	public static void insertionSort(int arr[]){
	    int n =	 arr.length;
	    
	    for(int i = 1; i<n;i++) {
	    	int j = i -1;
	    	int temp = arr[i];
	    	while(j>=0 && arr[j]>temp) {
	    		arr[j+1]=arr[j];
	    		j--;
	    	}
	    	arr[j+1] = temp;
	    }
	}
	
	public static int binarySearch(int arr[] , int key) {
		int low = 0;
		int high = arr.length -1;
		
		
		while(low<=high) {
		int mid = low + (high - low)/2;
		
		if(arr[mid] == key) {
			return mid;
		}
		
		if(key < arr[mid]) {
			high = mid-1;
			
		}
		else {
			low = mid+1;
		}
		}
			return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchAndSortAlgorithms obj = new SearchAndSortAlgorithms();
		
		int arr[] = {20,1,17,5,11,0,8,-1};
		
	    printArray(arr);
	    
//	    bubbleSort(arr);
//	    mergeSort(arr, new int[arr.length], 0, arr.length-1);
//	    quickSort(arr, 0,arr.length-1);
//	    selection(arr);
	    insertionSort(arr);
	    

	    
	    printArray(arr);
	    
	    System.out.println(binarySearch(arr, 0));

	    System.out.println(linearSearch(arr, 17));

	}

}
