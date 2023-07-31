package CollectionExampleB;

//this is an example for generic classes

class Test<T> //parameterized class // T is type 
{
	T a;

	public T getA() {
		return a;
	}

	public void setA(T a) {
		this.a = a;
	}
	 
}
public class GenericExample1 {

	public static void main(String[] args) {
        Test <Integer> r= new Test<Integer>();
        r.setA(12344);
        System.out.println(r.getA());

        Test <Float> g= new Test<Float>();
        g.setA(23.45f);
        System.out.println(g.getA());

	}
}
