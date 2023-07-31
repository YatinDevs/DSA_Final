package CollectionExampleB;
class Data<T>
{
	T x ,y;
	Data(T x,T y)
	{
		this.x= x;
		this.y=y ;
	}
	void display()
	{		System.out.println(this.x+ " "+this.y);	}
}
public class GenericExample3 {

	public static void main(String[] args) {
		 
		Data <String> s= new Data<String>("hello","welcome");
		Data <Integer> s1= new Data<Integer>(12,33);
		Data <Float> s2= new Data<Float>(12.f,33.2f);
		
	}

}
