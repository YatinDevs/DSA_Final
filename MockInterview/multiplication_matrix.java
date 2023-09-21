package MockInterview;
import java.util.*;

public class multiplication_matrix {
    public static  void multiply_matrix(int arr1[][],int arr2[][]) {
    	
    	int r1 = arr1.length;
    	int c1 = arr1[0].length;
    	
    	int r2 = arr2.length;
    	int c2 = arr2[0].length;
    	
    	if(c1 != r2) {System.out.println("Invalid Input");}
    	
    	int prod [] [] = new int [r1] [c2];
    	
    	for(int i=0;i<prod.length;i++) {
    		for(int j = 0;j<prod[0].length;j++) {
    			for(int k = 0;k<c1;k++) {
    				prod[i][j] = prod[i][j] + arr1[i][k] * arr2[i][k];
    			}
    			
    		}
    	}
    	
    	for(int i=0;i<prod.length;i++) {
    		for(int j = 0;j<prod[0].length;j++) {
    			System.out.print(	prod[i][j] );
    			}
    			
			System.out.println();

    		
    	}
    	
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[][] = {{1,2},
				       {4,5}};
		int arr2[][] = {{2,4},
				        {4,5}};
		
		
         multiply_matrix(arr1, arr2);
	}

}
