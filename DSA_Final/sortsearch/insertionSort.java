package sortsearch;
import java.util.*;

public class insertionSort {
	
	public static void insertionsort(int arr[]) {
		int n = arr.length;
		
		for(int i = 1; i<n;i++) {
			
			int temp = arr[i];
			int j=i-1;
			while(j >= 0 && arr[j]>temp) {
				
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
			
		}
	}
	
    public static void printArray(int arr[]) {
    	System.out.println(Arrays.toString(arr));
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int arr[] = {9,4,6,2,8,1};
		
		printArray(arr);
		insertionsort(arr);
		printArray(arr);
		
	}

}
