package CollectionExampleB;
//create a generic class but restrict its object to be of type only number
//Bound Type
class book{}
// only those classes will be used that will inherit Number class



//class Data7<T extends Number>   {T a,b;	//........}

class Data7<T extends Character>  
{
	T a,b;

	public T getA() {
		return a;
	}

	public void setA(T a) {
		this.a = a;
	}

	public T getB() {
		return b;
	}

	public void setB(T b) {
		this.b = b;
	}	 
	
}


public class GenericBoundType {

	public static void main(String[] args) {
		
		Data7 f= new Data7();//by default Object 
		
		//Data7 <Integer> f1= new Data7();
		//Data7 <Float> f2= new Data7();
		//Data7 <int> f3= new Data7(); no primitive type  
		 //Data7 <String> f4= new Data7();
		 
		 Data7 <Character> f5= new Data7();
		 f5.setA('a');
		 System.out.println(f5.getA());
		 
		
		 
		 
		 
		 //Data7 <book> f6= new Data7();
	}

}
