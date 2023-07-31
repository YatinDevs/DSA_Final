package Exceptionhandlingprograms;
//real world 
class Door
{
	int height ;
	int width;
	Door(int a,int b)
	{
		height=a;
		width=b;
	}
}
class House1
{
	Door d;
	String address;
	House1(Door e, String f)
	{
		d= e;
		address=f;
	}
	void show()
	{
		System.out.println(d.height + " "+ d.width +" "+ address);
	}
}
public class FunctionArguments {

	 
	public static void main(String[] args) {
		Door s= new Door(12,33);
		House1 h= new House1(s,"noida");
		h.show();
	}

}
