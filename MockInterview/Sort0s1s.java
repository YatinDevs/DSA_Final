package MockInterview;
import  java.util.*;


public class Sort0s1s {
	
	
	public static void swap(int arr[],int i,int j) {
   	 int temp = arr[i];
   	 arr[i] = arr[j];
   	 arr[j] = temp;
    }
    public static void display(int arr[]) {
   	 System.out.println( Arrays.toString(arr));
    }
    
    public static void sort0s1s(int arr[]) {
    	int n = arr.length-1;
    	int i = 0;
    	int j = 0;
    	while(i<=n) {
    		if(arr[i]==0) {
    			swap(arr, i, j);
    			i++;
    			j++;
    		}else if(arr[i]==1) {
    			i++;
    		}
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,1,0,1,0,1,0,1,1,0};
		
		display(arr);
		sort0s1s(arr);
		display(arr);

	}

}
