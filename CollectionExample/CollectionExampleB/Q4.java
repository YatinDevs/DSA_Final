package Exceptionhandlingprograms;

class AgeNotWithinRangeException extends Exception 
{
	AgeNotWithinRangeException()
	{
		System.out.println("age of student is not in range");
	}
}
class NameNotValidException  extends Exception
{
	NameNotValidException ()
	{
		System.out.println("name conatins number");
	}
}
class student 
{
	String name;
	int age ;
	String course;
	public student(String name, int age, String course) {
		super();
		this.name = name;
		this.age = age;
		this.course = course;
	}
	void checkAge()  throws AgeNotWithinRangeException
	{ 
		//try		{
		if(age>15 && age <21 )
			System.out.println(" Age is ok you are eligible");
		else             		
			throw new AgeNotWithinRangeException();
	
		//}catch( AgeNotWithinRangeException r)	{	System.out.println(" exception occured");	}
		
	}
	
	void checkName() throws   NameNotValidException  
	{ 
		 for( int i=0;i< name.length();i++)
		 {
		   if(! (name.charAt(i)>=97 && name.charAt(i)<=120))
		   {   
			   throw new NameNotValidException();
		   }
	}
		 System.out.println(name);
	}
}
public class Q4 {

	public static void main(String[] args) throws Exception 
	{
		student s= new student("ritu124",20,"Java"); 
        s.checkAge();
        System.out.println("rest program");
        s.checkName();
	}

}
