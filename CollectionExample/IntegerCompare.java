package CollectionExample;
 
 
public class IntegerCompare { 
  
    public static void main(String args[]) 
    { 
        int x = 20; 
        int y = 30; 
  
        // as 10 less than 20, 
        // Output will be a value less than zero 
        System.out.println(Integer.compare(x, y)); 
        int p = 40; 
        int q = 40; 
  
        // as 30 equals 30, 
        // Output will be zero 
        System.out.println(Integer.compare(p, q)); 
  
        int r = 20; 
        int s = 7; 
  
        // as 15 is greater than 8, 
        // Output will be a value greater than zero 
        System.out.println(Integer.compare(r, s)); 
       
    } 
}

