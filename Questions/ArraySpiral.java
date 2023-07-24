package DSA;
import java.util.*;
public class ArraySpiral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	      Scanner sc=new Scanner(System.in);
	      
	       int r=sc.nextInt();
	       int c=sc.nextInt();
	       int arr[][] =new int[r][c];
	       for(int i=0;i<r;i++){
	           for(int j=0;j<c;j++){
	               arr[i][j]=sc.nextInt();
	           }
	       }
	      
		
	       // to print the first row
		      
	       for(int i=0;i<c;i++){
	           System.out.print(arr[0][i]+" ");
	       }
	      
	       //to print last column
	       for(int i=1;i<r;i++){
	           System.out.print(arr[i][c-1]+" ");
	       }
	      
	       if((r>1)&&(c>1)){
	       //print last row
	       for(int i=c-2;i>=0;i--){
	           System.out.print(arr[r-1][i]+" ");
	       }
	      
	      
	      
	       //print 1st column
	       for(int i=r-2;i>=1;i--){
	           System.out.print(arr[i][0]+" ");
	       }
	       }
	       System.out.println();
	}

}
