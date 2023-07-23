package DSAself;

public class StringVowelcount {

       private static int countVowels(String str) {
    	   
         int count = 0;
      

        for (int i = 0; i < str.length(); i++) {
        	
        char ch = str.charAt(i);
        
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
           count++;
         }
        
        }

       return count;
      }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        String str = "Netwon School";
           int Count = countVowels(str);
        System.out.println("Number of vowels: " + Count);
	}

}
