package Arrays;
import java.util.*;

public class RemoveDuplicates {
  
	// Remove duplicates from Sorted array
	// https://leetcode.com/problems/remove-duplicates-from-sorted-array/
	public static int removeDuplicates(int arr[]) {
		int n = arr.length;
		int i = 0;
		
		for(int  j = 1; j < n;j++) {
			if(arr[i]!= arr[j]) {
				i++;
				arr[i] = arr[j];
			}
		}
		return i+1;
	}
	
	public static int removeDuplicates2(int arr[]) {
		
		int count = 1;
		
		for(int  j = 1; j < arr.length;j++) {
			if(arr[j]!= arr[j-1]) {
				arr[count++] = arr[j];
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       int nums1[] = {0,0,1,1,1,2,2,3,3,4};
       int nums2[] = {1,1,2};
       System.out.println(Arrays.toString(nums1));
      int ans = removeDuplicates2(nums1);
      System.out.println(ans);
      System.out.println(Arrays.toString(nums1));
	}

}
