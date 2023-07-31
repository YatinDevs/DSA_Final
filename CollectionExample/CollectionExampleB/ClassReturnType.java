package Exceptionhandlingprograms;


class Person1
{
	String name ;
	int age;
	Person1(String a,int b)
	{
		name=a;
		age=b;
	}
	void display()
	{
		System.out.println(name+ " "+age);
	}
}

public class ClassReturnType {

	static Person1  setData()
	 {
		 Person1 p= new Person1("neha" ,22);
		 return p;
		 
	 } 
	
	public static void main(String[] args) {
		Person1 l= setData();
		l.display();

	}

}
