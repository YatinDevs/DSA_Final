package Exceptionhandlingprograms;

public class StringException {

	public static void main(String[] args) {

         try
         {
		 System.out.println("welcome".charAt(9));

         }catch(StringIndexOutOfBoundsException f)
         {
        	 System.out.println(" string size is more");
         }
        System.out.println(" welcome to java world ");
	}

}
