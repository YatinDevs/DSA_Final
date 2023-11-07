package search_sort_algo;
import java.util.*;

public class binarySearch {
	
	public static int binarySearchh(int arr[],int target) {
		
		int low = 0;
		int high = arr.length-1;
		
		while(low <= high) {
			int mid = low + ( high - low) / 2;
			
			if(arr[mid] == target) {
				return mid;
			}
			if(arr[mid] > target){
				high = mid - 1;
			}
			else {
				low = mid + 1;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[] = {1,2,3,4,5,6,7};
		
		int index = binarySearchh(arr,1);
		
		if(index>-1) {
	        System.out.println("Number Found at index : " + index);
		}else {
			System.out.println("Target Not Found!!");
		}
	}
}
