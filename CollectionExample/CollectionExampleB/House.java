package Exceptionhandlingprograms;
//write a function that takes three integer argumnet and return their sum 
class Test
{
int sum(int a,int b,int c)
	{
		return a+b+c;
	}

char show()
{
	return 'r';
}
}
public class House {

	public static void main(String[] args) {
		 
   Test r= new Test();
   int y = r.sum(10,20,30);
   System.out.println(y);
	}

}
