package CollectionExample;

 
public class Sample_string 
{
    public static void main(String[] args) {
        String str1 = "a";
        
        System.out.println("Compare To 'a' b is : " + str1.compareTo("a"));
        str1= "b";
        System.out.println("Compare To 'b' a is : " + str1.compareTo("a"));
        str1 = "b";
        System.out.println("Compare To 'b' b is : " + str1.compareTo("b"));
   
    }
}
