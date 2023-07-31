package CollectionExample;
//wap to ask 3 records of student in an array and store then to vector 
  
import  java.util.*;

class student2 
{
	String name;
	int age;
	
	public student2(String name, int age) {
		super();  //every class parent class is Object 
		          //super calls parent class constructor
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "\n [name=" + name + ", age=" + age + "]";
	}
	
}

public class VectorStudentArray {
 

		public static void main(String[] args) {
			
			student2 s[]= new student2[10]; //10 reference
			
			Scanner sc= new Scanner(System.in);
			
			Vector <student2>v= new Vector<student2>();
			
			for(int i=0;i<3;i++)
			{
				System.out.println("enter name and age");
				String n= sc.next();
				int a= sc.nextInt();
				s[i]= new student2(n,a);
				v.add(s[i]);
				 
			}
					
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
