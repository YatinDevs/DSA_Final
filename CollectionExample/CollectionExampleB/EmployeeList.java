package CollectionExampleB;

import java.util.Stack;

//wap to store five employees data in a stack collection
//stack works on LIFO last in first out 

class Empdata
{
	String name;
	int empid;
	public Empdata(String name, int empid) 
	{
		super();
		this.name = name;
		this.empid = empid;
	}
	@Override
	public String toString() {
		return "Empdata [name=" + name + ", empid=" + empid + "]";
	}
	
}

public class EmployeeList {

	public static void main(String[] args) {
		
		Empdata e= new Empdata("jayesh",1234);
		Empdata e1= new Empdata("pooja",34);
		Empdata e2= new Empdata("rena",34);
		
		
		Stack  <Empdata> s= new Stack();
		
		s.add(e);
		s.add(e1);
		s.add(e2);
		s.remove(e1);
		
		  Empdata e3= new Empdata("tina",54);
		  s.push(e3);//add data on last
		//System.out.println(s.peek());// peek will only display last record
		//System.out.println(s.pop());// pop will remove last inserted data
		//System.out.println(s.pop());//pop  remove last inserted data
		//System.out.println(s.size());
		
		  System.out.println(s);

	}

}
