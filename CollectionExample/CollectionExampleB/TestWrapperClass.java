package CollectionExampleB;

public class TestWrapperClass {

	
	static void show(int x)
	{
		System.out.println("primitive type"+x);
	}
	static void show(Integer e)
	{
		System.out.println("wrapper autoboxing"+ e);
	}
	public static void main(String[] args) {
		
		show(20);
		show( new Integer(30));
		

	}

}
