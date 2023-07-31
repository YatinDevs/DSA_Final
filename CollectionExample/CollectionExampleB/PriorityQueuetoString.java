package CollectionExampleB;

import java.util.PriorityQueue;



class abc
{
	int a=123;
	int b=456;
	int c=6788;
	 
	public String threeString() {
		return "abc [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	
	
	
}
public class PriorityQueuetoString {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> e= new PriorityQueue();
		e.add(10);
		e.add(20);
		e.add(33);
		System.out.println(e);
		
		
		abc r= new abc();
		
		
		String h= r.toString();
		System.out.println(r);
	}

}
