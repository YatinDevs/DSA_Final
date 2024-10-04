package Arrays;
import java.util.*;

public class LargestInArray {
	
	public static int largestEle(int arr[]) {
		int n = arr.length;
		int max = arr[0];
		for(int i=0;i<n;i++) {
			if(arr[i] >= max) {
				max= arr[i];
			}
		}
		return max;
	}
	
	public static int smallestEle(int arr[]) {
		int n = arr.length;
		int min = arr[0];
		for(int i=0;i<n;i++) {
			if(arr[i] <= min) {
				min= arr[i];
			}
		}
		return min;
	}
    
    
	public static int secondLargest(int arr[]) {
		int n = arr.length;
		int secmax = 0;
		int max = 0;
		for(int i=0;i<n;i++) {
			 if(arr[i] > max) {
				 secmax = max;
				 max = arr[i];
			}else if(arr[i] > secmax && arr[i] != max) {
				secmax = arr[i];
			}
		}
		return secmax;
	}
	
	public static int secondsmallestEle(int arr[]) {
		int n = arr.length;
		int min = Integer.MAX_VALUE;
		int secmin = Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			if(arr[i] < min) {
				secmin = min;
				min= arr[i];
			}else if(arr[i] < secmin && arr[i] != min) {
				secmin =arr[i];
			}
		}
		return secmin;
	}
    public static boolean isSorted(int arr[]) {
    	for(int i = 1;i<arr.length;i++) {
    		if(arr[i]< arr[i-1]) {
    			return false;
    		}
    	}
    	return true;
    }
	public static void main(String args[]) {
      int arr[] = {1 ,128 ,7 ,56 ,90,100,125};
      int arr2[] = {1,2,3,4,5};
      
      int output = largestEle(arr);
      System.out.println(output);
      
      boolean sec = isSorted(arr2);
      System.out.println(sec);

	}
}
