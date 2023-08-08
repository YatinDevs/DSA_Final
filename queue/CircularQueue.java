package queue;



public class CircularQueue {
	int arr[];
	int front;   // index of first element of queue
	int rear;  // index of last inserted element of the queue
	int max;
	
	public CircularQueue() {
		max=8;
		arr=new int[max];
		front=-1;
		rear=-1;
	}
	public CircularQueue(int m) {
		max=m;
		arr=new int[max];
		front=-1;
		rear=-1;
	}
	
	public void Enqueue(int value)
	{
		if((front==0 && rear==max-1)||rear==front-1)  //front==rear+1
			System.out.println("queue is full");
		else
		{
			if(rear==max-1)
				rear=0;
			else
				rear++;
			
			arr[rear]=value;
			if(front==-1)
				front=0;
		}
	}
	public int Dequeue()
	{
		int val=0;
		if(front==-1)
		{
			System.out.println("queue is empty");
		}
		else
		{
			val=arr[front];
			arr[front]=0;
			if(front==rear)
			{
				front=-1;
				rear=-1;
			}
			else
			{
				if(front==max-1)
					front=0;
				else
					front++;
			}
		}
		return val;
}
	 public void display()
	 {
		 if(front==-1)
			{
				System.out.println("queue is empty");
			}
			else
			{
				System.out.println("queue elements are shown below");
				if(rear>=front)
				{
				for(int i=front; i<=rear;i++)
					System.out.println(arr[i]);
				}
				else
				{
					for(int i=front;i<=max-1;i++)
						System.out.println(arr[i]);
					for(int i=0;i<=rear;i++)
						System.out.println(arr[i]);
				}
			}
	 }
	}
