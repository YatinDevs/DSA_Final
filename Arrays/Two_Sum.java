package Arrays;

public class Two_Sum {
	
	// Problem Statement: Given an array of integers array[] and an integer target.
    // 1st variant: Return YES if there exist two numbers such that their sum is equal to the target. Otherwise, return NO.
	// 2nd variant: Return indices of the two numbers such that their sum is equal to the target. Otherwise, we will return {-1, -1}.
	
	// Note: You are not allowed to use the same element twice. 
	// Example: If the target is equal to 6 and num[1] = 3, then nums[1] + nums[1] = target is not a solution.\
	
	public static int two_sum(int arr[],int target) {
		int N = arr.length;
		
		int l= 0;
		int r= N - 1 ;
		
		while(l<N && r > 0 ) {
			
			if(arr[l] + arr[r] == target ) {
				
				System.out.print("Yes" + arr[l] + " "+arr[r]);
				l++;
				r--;
			}
		}
		 
		return -1;
	}
	public static void main(String args[]) {
		
	//Example 1:
	// 	Input Format: N = 5, arr[] = {2,6,5,8,11}, target = 14
		
		int arr[] = {2,6,5,8,11};
		int target = 5 ;
		two_sum(arr,target);
		
		
	}

}
