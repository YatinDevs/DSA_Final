package Arrays;
import java.util.*;

public class isSortedRotated {
   
// Check if Array Is Sorted and Rotated
// https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/
	
	public static boolean isSorted(int arr[]) {
		
		int n = arr.length;
		
		for(int i = 0;i<n-1;i++) {
			if(arr[i] > arr[i+1]) {
				return false;
			}
		}
		
		return true;
		
	}
	
   public static boolean isSortedandRotated(int arr[]) {
		
		int n = arr.length;
		int count = 0;
		for(int i = 0;i<n-1;i++) {
			if(arr[i] > arr[i+1]) {
				count++;
			}
		}
		
		if(arr[n-1] > arr[0]) {
			count++;
		}
		
		return count <= 1;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums1[] = {3,4,5,1,2};
		int nums2[] = {2,1,3,4};   
		int nums3[] = {1,2,3};
		
	    boolean ans = isSortedandRotated(nums2);
	    System.out.println(ans);
	}

}
