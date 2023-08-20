package LeetCodeQuestions;
import java.util.*;

public class MergeSortedArray {
	    public void merge(int[] nums1, int m, int[] nums2, int n) {
	         int i = 0;
	         int j = 0;
	         
	         int arr[] = new int[m+n];
	         int k=0;
	         while(i<m && j<n){
	             if(nums1[i]<nums2[j]){
	                 arr[k]=nums1[i];
	                 i++;
	             }else{
	                 arr[k]=nums2[j];
	                 j++;
	             }
	             k++;
	         }
	         while(i<m){
	            arr[k]=nums1[i];
	            i++;
	            k++;
	         }
	         while(j<n){
	             arr[k]=nums2[j];
	             j++;
	             k++;
	         }
	        int z=0;
	       
	        for(int x =0; x< m+n ; x++)
	            nums1[x] = arr[x];
	        
	        return;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
