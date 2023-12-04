package sortsearch;
import java.util.*;
public class selectionSort {
	
	
	public static void selectionSorting(int arr[]) {
		int n = arr.length;//6
		
		for(int i= 0;i<n-1;i++) {
			// 0 1 2 3 4  - 5 times 
			int min = i;
			for(int j = i+ 1;j<n;j++) {
				//  1 2 3 4 5 - 5 times
				if(arr[min]> arr[j]) {
					min = j;
				}
				
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}
	public static void printArray(int arr[]) {
		
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int arr[] = {8,1,5,2,6,4}; // 6 Element
          
          printArray(arr);
   // Selection Sort 
   /*
    *   In Selection Sort 
    *   1. Divide Array -> Sorted Part / UnSorted Part
    *   2. Minimum pointer -> Traverse Unsorted Part and Find Min
    *   3. Swap LeftMost Unsorted Part and Minimum.
    *   4. Now Sorted Part as One Element After 1 Traversal Pass.     
    */
          selectionSorting(arr);
          printArray(arr);

          
     
	}

}
