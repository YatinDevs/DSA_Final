package Arrays;
import java.util.*;

public class LeftRotateArray {
	
	public static int[] leftRotate (int arr[],int n) {
		int updated[] = new int[n];
		
		for(int i = 1;i<n;i++ ) {
			updated[i-1] = arr[i];
		}
		updated[n-1] = arr[0];
		
		return updated;
	}
	
	
	 public static void rotateRight(int[] nums, int k) {
	        while(k-- > 0){
	        int last = nums[nums.length-1];
	        for(int i = nums.length-1;i > 0;i--){
	            nums[i] = nums[i-1];
	        }
	        nums[0] = last;
	        }

	   }
	 
	 public static void reverseArray(int arr[],int start ,int end ) {
		 
		 
		 while(start <= end) {
			 
			 int temp = arr[start];
			 arr[start] = arr[end];
			 arr[end] = temp;
			 start++;
			 end--;
		 }
		 
	 }
	 

	 public static void rotateRightByD(int[] arr, int d ,int n) {
	       
           // n = 9 , d = 2
		   // n-d = 7 
		   // Modulo to overcome repetitive rotations
		   // d = d % n
		   
		  if(n == 0) return;
		  d = d % n;
		  
		  if( d > n)return;
		  
		 // Brute Force
		   int temp[] = new int[d];
		   
		   // O (d)
		   for(int i = 0; i < d ; i++ ) {
			   temp[i] = arr[i];
		   } 
		   //  1,2,3,4,5,6,7,8
		   
		   // d = 2 , n = 9 
		   
		   // expected  7 8 1 2 3 4 5 6
		   
		   // O(n-d)
		   for(int i = 0; i < n-d; i++) {
			   
			   arr[i] = temp[i + d];
			   
		   }
		   
		  // O(n - n-d ) i.e O(d)
		   for(int i = n-d; i < n; i++) {
			   
			   arr[i] = temp[i - n + d];
			   
		   }
	   }
	 
	  // Optimal 
	  public static void rotateByD (int arr[],int n , int k) {
		  // 0  n-k 
		  // n-k n
		  // 0 n
		  reverseArray(arr,0,n-k-1);
		  reverseArray(arr,n-k,n-1);
		  reverseArray(arr,0,n-1);
		  
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  
		  int arr[]= {1,2,3,4,5,6,7,8}; 
		  int n=arr.length;
//		  rotateRight(arr,1);
//		  reverseArray(arr);
		  rotateByD(arr,n,2);
		  System.out.println(Arrays.toString(arr));
		  
		  
		  
		  
	}

}
