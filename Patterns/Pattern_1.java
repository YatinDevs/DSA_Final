package Patterns;

public class Pattern_1 {
    public static void pattern_1(int n) {
    	for(int i = 1;i<=n;i++) {  // 1 2 3 4 5
    		
    		for(int j=1;j<=n;j++) {
    			System.out.print("*");
    		}
    		System.out.println("");
     		
    	}
    }
    public static void pattern_2(int n) {
    	for(int i=1;i<=n;i++) {
    		for(int j=1;j<=i;j++) {
    			System.out.print("*");
    		}	System.out.println("");
    	}
    }
    public static void pattern_3(int n) {
    	for(int i=1;i<=n;i++) {
    		for(int j=1;j<=i;j++) {
    			System.out.print(j);
    		}	System.out.println("");
    	}
    }
    public static void pattern_4(int n) {
    	for(int i=1;i<=n;i++) {
    		for(int j=1;j<=i;j++) {
    			System.out.print(i);
    		}	System.out.println("");
    	}
    }
    public static void pattern_5(int n) {
    	for(int i=1;i<=n;i++) {
    		for(int j=1;j<=n+1-i;j++) {
    			System.out.print("*");
    		}	System.out.println("");
    	}
    }
    public static void pattern_6(int n) {
    	for(int i=1;i<=n;i++) {
    		for(int j=1;j<=n+1-i;j++) {
    			System.out.print(j);
    		}	System.out.println("");
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          pattern_1(5);
          pattern_2(5);
          pattern_3(5);
          pattern_4(5);
          pattern_5(5);
          pattern_6(5);
	}

}
