package CollectionExample;
import  java.util.*;

class student
{
	String name;
	int age;
	
	public student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "\n [name=" + name + ", age=" + age + "]";
	}
	
}

public class VectorStudent {
 

		public static void main(String[] args) {
			
			
			student s= new student("priya",23);
			student s1= new student("neha",26);
			student s2= new student("ashu",24);
			student s3= new student("gagan",13);
					
			Vector <student>v= new Vector<student>(); 
			v.add(s);
			v.add(s1);
			v.add(s2);
			v.add(s3);
			System.out.println(v.size() +"  " + v.capacity());
		    System.out.println(v);			
		
		}

	}
