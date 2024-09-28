package Patterns;

public class Pattern_2 {
    public static void pattern_7(int n) 
    {
    	
    	for(int i=1;i<=n;i++) {
    		for(int j=1;j<=n+1-i;j++) {
    			System.out.print(" ");
    		}
    		for(int j=1;j<=i*2-1;j++) {
    			System.out.print("*");
    		}
    		System.out.println("");
    	}
    }
    public static void pattern_8(int n) 
    {
    	
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		pattern_7(5);
		pattern_8(5);
	}

}
