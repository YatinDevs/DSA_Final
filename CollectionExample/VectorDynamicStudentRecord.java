package CollectionExample;

import  java.util.*;
 

public class VectorDynamicStudentRecord {


		public static void main(String[] args) {
			
			 
			    String choice;
			    Scanner sc= new Scanner(System.in);
			    Vector <student2>v= new Vector<student2>();
			do
			{
			    System.out.println("enter name and age");
				String n= sc.next();
				int a= sc.nextInt();
				
				v.add(new student2(n,a));
				
				System.out.println("do you want to add more record");
				choice= sc.next();
			} while(choice.equals("yes"));
					
		   // System.out.println(v.get(0));
		    
		    Iterator i= v.iterator();
		    while(i.hasNext())
		    {
		    	student2 k=(student2) i.next();
		    	if(k.age>20)
		    	System.out.println(k);
		    	
		    }
		    		
		
		}

	}

