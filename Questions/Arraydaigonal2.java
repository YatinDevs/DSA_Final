package DSA;

import java.util.Scanner;

public class Arraydaigonal2 {
	 public static void main (String[] args) {

	 Scanner sc = new Scanner(System.in);


     int t = sc.nextInt();


     while(t>0){
     int r=sc.nextInt();
     int c=sc.nextInt();
     int arr[][] =new int[r][c];
     for(int i=0;i<r;i++){
         for(int j=0;j<c;j++){
             arr[i][j]=sc.nextInt();
         }
      }
     int k=0;
     
     for(int i=0;i<r;i++) {
    	 System.out.print(arr[i][i]+" ");
    	 
     }
     
     for(int i=0;i<r;i++) {
    	 System.out.print(arr[i][r-1-i]+" ");
     }
     
     
    
    
    t--;
    }
}
}