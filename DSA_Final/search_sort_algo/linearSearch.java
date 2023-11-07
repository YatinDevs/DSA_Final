package search_sort_algo;
import java.util.*;
public class linearSearch {
    
	public static int linearSearch(int arr[],int target) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == target) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int arr[] = {1,2,3,4,5,6,7};
		
		int index = linearSearch(arr,5);
		
		if(index>-1) {
	        System.out.println("Number Found at index : " + index);
		}else {
			System.out.println("Target Not Found!!");
		}
	}

}
