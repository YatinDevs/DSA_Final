package SearchingAlgo;
import java.util.*;
import java.util.Scanner;

public class LinearSearch {
	
    public int linearSearch(int arr[],int target) {
    	for(int i=0;i<arr.length;i++) {
    		if(arr[i]==target) {
    			return i;
    		}
    	}
       return -1;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinearSearch obj=new LinearSearch();
		Scanner scanner=new Scanner(System.in);
          int arr[]= {9,3,6,4,1};
          int target=scanner.nextInt();
          
          int index=obj.linearSearch(arr,target);
          System.out.println("Index of Target is : "+index);
           
          
	}

}

