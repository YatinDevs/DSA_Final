package Arrays;
import java.util.*;
public class MoveZeroToEnd {
 // Move all Zeros to the end of the array
	
	public static int[] moveZeros(int arr[],int n) {
		int temp[] = new int[n] ;
		int j = 0;
		for(int i = 0;i<n;i++) {
			if(arr[i] != 0) {
				temp[j] = arr[i];
				j++;
			}
		}
		
		return temp;
	}
	public static int[] moveZeros2(int arr[],int n) {
		int j = -1;
		//place the pointer j:
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }
        if (j == -1) return arr;
		
       
        return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
	       int n = arr.length;
	      int output[] =  moveZeros2(arr,n);
	       System.out.println(Arrays.toString(output));
	}

}
