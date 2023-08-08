package queue;

public class Queuearray {
int arr[];
int capacity;
int front,rear;

public Queuearray() {
	capacity=8;
	arr=new int[capacity];
	front=-1;
	rear=-1;
}
public Queuearray(int c) {
	capacity=c;
	arr=new int[capacity];
	front=-1;
	rear=-1;
}

public void Enqueue(int value)
{
	if(rear==capacity-1)  // overflow condition
	{
		System.out.println("queue full");
	}
	else
	{
		rear++;
		arr[rear]=value;
		if(front==-1)  // inserting first node then make front point to it
			front=0;
	}
}

public int Dequeue()
{
	int val=0;
	if(front==-1)
	{
		System.out.println("queue empty");
	}
	else
	{
		val=arr[front];
		arr[front]=0;
		if(front==rear)  // single node
		{
			front=rear=-1;
		}
		else
			front++;
	}
	return val;
}
void display()
{
	if(front==-1)
	{
		System.out.println("queue empty");
	}
	else
	{
		System.out.println("elemnts in queue are given below");
		for(int i=front;i<=rear;i++)
			System.out.println(arr[i]);
	}
}
public static void main(String[] args) {
	Queuearray qa=new Queuearray();
	qa.Enqueue(10);
	qa.Enqueue(20);
	qa.Enqueue(30);
	qa.Enqueue(40);
	qa.Enqueue(50);
	qa.display();
	System.out.println(qa.Dequeue() +" is elemnt deleted from q");
	System.out.println(qa.Dequeue() +" is elemnt deleted from q");
	System.out.println(qa.Dequeue() +" is elemnt deleted from q");
	qa.display();
}

}
