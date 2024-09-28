package Sorting;

import java.util.*;

public class MergeSortt {
	// Merge Sort is divide and conquers algorithm, it divides the given array into two equal 
		// parts and then merges the 2 sorted parts.
		
		// There are 2 main Functions ;
		
		// 1. merge() : This function is used to merge the 2 halves of the array. 
		// It assumes that both parts of the array are sorted and merges both of them.
		
		// 2. mergeSort() : This function divides the array  into 2 parts.
		// a . low to mid 
		// b . mid+1 to high
	    
		// We recursively split the array, and go from top-down until all sub-arrays size becomes 1.
	    public static void merge(int arr[],int low,int mid,int high) {
	    	
	    	ArrayList<Integer> temp = new ArrayList<>();
	    	
	    	int left = low ;
	    	int right = mid + 1; 
	    	
	    	while(left <= mid && right <= high) {
	    	      
	    		if(arr[left] <= arr[right]) {
	    		    temp.add(arr[left]);
	    		    left++;
	    		} else {
	    			temp.add(arr[right]);
	    			right++;
	    		}
	    	}
	    	
	    	while(left <= high) {
	    		temp.add(arr[left]);
	    		left++;
	    	}
	    	
	    	while(right <= high) {
	    		temp.add(arr[right]);
	    		right++;
	    	}
	    	
	    	for(int i = low; i <= high; i++) {
	    		arr[i] = temp.get(i-low);
	    	}
	    	
	    	
	    }
	    
	    public static void mergeSort(int arr[],int low,int high) {
	    	
	    	if(low>=high) {
	    		return;
	    	}
	    
	    	int mid = (low + high) / 2;
	    	mergeSort(arr,low,mid);
	    	mergeSort(arr,mid+1,high);
	    	merge(arr,low,mid,high);
	    }
	
		public static void main(String args[]) {
			
			// Given an array of size n , sort the array using Merge Sort
			   int arr[] = { 9, 14, 7, 6, 13, 1, 11};
			   int n = arr.length;
			     
			   System.out.println("Before Sort: " + Arrays.toString(arr));
			   mergeSort(arr,0,n-1);
			   System.out.println("After Sort: " + Arrays.toString(arr));
			
		}
}
