package LeetCodeQuestions;
import java.util.*;

public class RemoveDuplicatesSortedArray {
	    public int removeDuplicates(int[] nums) {
	        int n=nums.length;
	        if(n==0){
	            return 0;
	        }
	        int idx=0;
	        for(int i=0;i<n;i++){

	            if(nums[idx]!=nums[i]){
	                idx++;
	                nums[idx]=nums[i];
	            }
	        }
	        return idx+1;
	    }
	    
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
