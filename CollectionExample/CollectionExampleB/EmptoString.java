package CollectionExampleB;

public class EmptoString {
String name="neha" ;
int age=23;


@Override
public String toString()
{
	return "EmptoString [name=" + name + ", age=" + age + "]";
}

	void get()
	{}
	

	public static void main(String[] args) {
		
		EmptoString e= new EmptoString();
		System.out.println(e.toString());// this will automatically call toString
		//or 
		System.out.println(e);
		e.get();
	}

}
