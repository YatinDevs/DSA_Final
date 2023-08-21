package LeetCodeQuestions;
import java.util.*;

public class TwoSum_1 {
	
	public static int[] twoSum(int[] nums, int target) {
        
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int sum=nums[i]+nums[j];
                if(sum==target){
                    int result[] = new int[2];
                    result[0]=i;
                    result[1]=j;
                    return result;
                }
            }
        }
        return new int[0];
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {2,7,11,15};
	    int target = 9;
	    /*
				Output: [0,1]
				Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
				Example 2:

				Input: nums = [3,2,4], target = 6
				Output: [1,2]
				Example 3:

				Input: nums = [3,3], target = 6
				Output: [0,1]
			*/
	    int result[] = twoSum(nums, target);
	    for(int i=0;i<result.length;i++) {
		    System.out.print(result[i]+" ");
	    }
	}

}
