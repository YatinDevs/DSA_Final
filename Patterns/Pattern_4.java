package Patterns;

public class Pattern_4 {
    public static void pattern_10(int n) {
    	// upper
    	for(int i=1;i<=n;i++) {
    		for(int j=1;j<=i;j++) {
    			System.out.print("*");
    		}
    		System.out.println(" ");
    	}
    	// lower
    	for(int i=1;i<=n;i++) {
    		for(int j=1;j<=n-i;j++) {
    			System.out.print("*");
    		}
    		System.out.println(" ");
    	}
    }
    public static void pattern_11(int n) {
    	// upper
    	for(int i=1;i<=n;i++) {
    		for(int j=1;j<=i;j++) {
    			   if ((i + j) % 2 == 0) {
                       System.out.print(1);
                   } else {
                       System.out.print(0);
                   }
    		}
    		System.out.println(" ");
    	}
    	// lower
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//         pattern_10(5);
         pattern_11(5);
	}

}
