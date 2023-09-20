package MockInterview;
import java.util.*;

public class quickSort {

    public static void display(int arr[]){
         System.out.println(Arrays.toString(arr));
    }
	
	public static int partition (int arr[],int low,int high) {
		int pivot = arr[high];
		int i=low;
		int j=low;
		
		  while(i<=high) {
			  if(arr[i]<=pivot) {
				  int temp = arr[j];
				  arr[j] = arr[i];
				  arr[i]=temp;
				  j++;
				  
			  }
			  i++;
		  }
		return j-1;
	}
	
	public static void quickSort(int arr[],int low,int high) {
		
		if(low<high) {
			int p = partition(arr,low,high);
			quickSort(arr, p+1, high);
			quickSort(arr, low ,p-1);

		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[] = {9,2,8,4,6,-1,5};
        display(arr);

        quickSort(arr,0,arr.length-1);
        display(arr);

	}

}
