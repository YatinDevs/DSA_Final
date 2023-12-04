package Arrays;
import java.util.*;

public class reverse_a_array {

	 public static int [] reversearr(int []arr) {
		 
		 int high = arr.length - 1; // n = 7
		 int low = 0 ;
		 while(low < high){
			 int temp = arr[low];
			 arr[low] = arr[high];
			 arr[high] = temp;	
			 low++;
			 high--;
		 }
		 
		 return arr;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr []= {9,8,7,6,5,4,3,2,1}; // n = 7
		
		reversearr(arr);
		for(int i = 0;i < arr.length-1;i++) {
			System.out.print(arr[i]);
		}
		

	}

}
