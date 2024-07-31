package SearchingAlgo;

import java.util.Arrays;

public class LinearSearch {
	
	
	public static void printArray(int arr[]) {
		
		System.out.println(Arrays.toString(arr)); 
		
	}
	
	
	public static int linearSearch(int arr[],int find) {
		
		int n = arr.length;
		for(int i=0;i<n;i++) {
			if(arr[i]== find) {
				return i;
			}
		}
		return -1;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr []= {7,5,9,2,8};
		
		int searchResult = linearSearch(arr,1);
		
		if(searchResult != -1) {
			System.out.println("Element Found on Index " + searchResult + " Value is " + arr[searchResult]);
		}else {
			System.out.println("Element Not Found!");
		}
		
		
	}

}
