package DSA;
import java.util.*;
public class ArrayMaxFreq {

	  public static int maxfrequency1 (int arr[]){
	  
	    
	    int count=0;
	    int maxfreqcount=0;
	    int maxfreq=arr[0];
	       for(int i=0;i<arr.length;i++){
	          for(int j=0;j<arr.length;j++){
	              if(arr[i]==arr[j]){
	                  count++;
	                }
	                if(count>=maxfreqcount){
	                       maxfreqcount=count;
	                      maxfreq=arr[i];
	                } 
	         } 
	       }

	        return maxfreq;

	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayMaxFreq obj= new ArrayMaxFreq();
	     

        Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          int arr[]=new int[n];
        for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
            }
          
         int result=obj.maxfrequency1(arr);
         System.out.print(result);
	}

}
