package CollectionExampleB;

import java.util.Comparator;
import java.util.PriorityQueue;

class Student4 
{
	String name;
	int age;
	public Student4(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return " [name=" + name + ", age=" + age + "]";
	}
	
	
}
public class StudentPriorityDemo {

	public static void main(String[] args) {
		 
		Student4 d= new Student4("priya",13);
		Student4 d1= new Student4("neha",23);
		Student4 d2= new Student4("ashu",93);
		Student4 d3= new Student4("jayant",16);
	
		PriorityQueue<Student4> p= new PriorityQueue<Student4>(10,new studentcomparator());
		 
		p.add(d);
		p.add(d1);
		p.add(d2);
		p.add(d3);
		 System.out.println(p.poll());
		 System.out.println(p.poll());
		 System.out.println(p.poll());
		 System.out.println(p.poll());
	}
}
class studentcomparator implements Comparator<Student4>
{

	@Override
	public int compare(Student4 s1, Student4 s2) {
	 
		if(s1.age>s2.age )	
			{
					return 23;
			}
		   else if(s1.age<s2.age)	
			{
					return -44;
			}
		return 0;
	}
	 
}
