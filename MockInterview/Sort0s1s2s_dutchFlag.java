package MockInterview;
import  java.util.*;
public class Sort0s1s2s_dutchFlag {
	// Time Complexity --> O(N) 
	// 3 Pointers Approach
	// i,j,k --> three pointer tracking each of 0s 1s and 2s.
	// j --> will keep track of 0s.
	// i --> will keep track of 1s.
	// k --> will keep track of 2s.
	
     public static void sort_dutch_flag(int arr[]) {
    	 int i = 0;
    	 int j = 0;
    	 int k = arr.length-1;
    	 
    	 // we will traverse from both sides and sort this array
    	 // i will traverse from left and at same time k from end of array.
    	 while(i<=k) {
    		 if(arr[i]==0) {
    			 swap(arr, i, j);
    			 j++;
    			 i++;
    		 }else if(arr[i]==1) {
    			 i++;
    		 }else if(arr[i]==2) {
    			 swap(arr, i, k);
    			 k--;
    		 }
    	 }
     }
     
     public static void swap(int arr[],int i,int j) {
    	 int temp = arr[i];
    	 arr[i] = arr[j];
    	 arr[j] = temp;
     }
     public static void display(int arr[]) {
    	 System.out.println( Arrays.toString(arr));
     }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,0,0,2,1,1,2,0};
		// Sort 0s,1s,2s. 
		display(arr);
		
		// Input : [1, 2, 0, 0, 2, 1, 1, 2, 0]

        sort_dutch_flag(arr);
		display(arr);

		// output here should be : [0, 0, 0, 1, 1, 1, 2, 2, 2]

		
		
	  
	}

}
