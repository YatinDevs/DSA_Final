package MockInterview;
import java.util.*;

public class Array_2D {
	
	public static void  print_2Darray (int arr[][]) {
		int n = arr.length;
		
		for(int i = 0;i<n;i++) {
			for(int j = 0; j<n ; j++) {
				System.out.print( arr[i][j] + " "); 
			}
			System.out.println(); 

		}
	}
	
	public static void addition_matrix (int arr[][]) {
		int n = arr.length;
		int sum = 0;
		for(int i = 0;i<n;i++) {
			for(int j = 0; j<n ; j++) {
				
				 sum += arr[i][j]; 
			}
			System.out.println(); 

		}
		System.out.println(sum); 

	}
    
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = 3;
//		int matrix[][] = new int [n][n];
		int matrix[][] = {{1, 2, 3},{4,5,6},{7,8,9}};

//		
//		for(int i = 0;i<n;i++) {
//			for(int j = 0; j<n ; j++) {
//				matrix[i][j] = sc.nextInt();
//			}
//		}
//		
		print_2Darray(matrix);
		addition_matrix(matrix);
		
	}

}
