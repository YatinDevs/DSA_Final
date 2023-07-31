package CollectionExampleB;

public class isString{

private static boolean isSubstring(String str1, String str2) {
		
	    int cursor=0;
		
		for (int i=0;i<str1.length();i++) {
			 if(str1.charAt(i)==str2.charAt(cursor)) {
				 
				  cursor++;	 
				  
		      	 if(cursor==str2.length()) {
				 
					    return true;
				   }
		      	 else {
		      		 
		      	  

		      	 }
			  }
		  
	         	else
	        	{
			       cursor=0;
		       }
		
	}
   return false;
}
	
	public static void main(String[] args) {
	
        String str1="madam";
        String str2="dam";
        System.out.println(isSubstring(str1,str2));
	}

	


	
	
	
}

