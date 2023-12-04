package sortsearch;
import java.util.*;
public class bubbleSort {
	public static void swap(int arr[],int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void bubblesort(int arr[]) {
		int n = arr.length;
		boolean isSwapped;
		 for(int i = 0;i<n-1;i++) {
			 isSwapped = false;
	       for(int j=0;j<n-1-i;j++) {
	    	   if(arr[j]>arr[j+1]) {
	    		   
	    		   swap(arr,j,j+1);
	    		   isSwapped = true;
	     	   }	   
	        }	
	      if(isSwapped==false) {break;}
	     }
	}
	
	public static void printArray(int arr[]) {
		System.out.println(Arrays.toString(arr));
	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[] = {2,5,6,7,1,9}; // 6 Element
        printArray(arr);
        bubblesort(arr);
        printArray(arr);
	}

}
