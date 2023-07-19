package SearchingAlgo;
import java.util.*;
import java.util.Scanner;

public class Binary {
    
	public void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
	}

    public int binarySearch(int arr[],int target) {
    	int n=arr.length;
        int start=0;
        int end=n-1;
        
        while(start<=end) {
        	
        	int mid=start+(end-start)/2;
        	
        	if(arr[mid]==target) {
        		return mid;
        	}
        	
        	if(arr[mid]<target) {
        		start=mid+1;
        	}else
        	{
        		end=mid-1;
        	}
        }
    	return -1;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Binary obj=new Binary();
		Scanner scanner=new Scanner(System.in);
          int arr[]= {9,3,6,4,1};
          int target=scanner.nextInt();
          
          Arrays.sort(arr);
          obj.printArray(arr);
          
          
          int index=obj.binarySearch(arr, target);
          System.out.println("Index of Target is  : "+index +" in Sorted Array of Given Input Array ");
	}

}
