package Patterns;

public class Pattern_3 {
	
	public static void diamond_9(int n) {
		// upper triangle
		for(int i=1;i<=n;i++) {
			 for(int j=1;j<=n-i+1;j++) {
				   System.out.print(" ");
			   }
			 for(int j=1;j<=i*2-1;j++) {
				   System.out.print("*");
			   }
			 System.out.println("");
		}
		// lower triangle
        for(int i=1;i<=n;i++) {
		   for(int j=1;j<=i;j++) {
			   System.out.print(" ");
		   } 
		   for(int j=1;j<=2*n-i*2+1;j++) {
			   System.out.print("*");
		   }
		   System.out.println("");	
		}
       
	}
	public static void main(String args[]) {
		diamond_9(5);
	}
}
