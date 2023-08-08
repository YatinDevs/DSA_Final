package queue;



	public class Deque {
		int arr[];
		int front;   // index of first element of queue
		int rear;  // index of last inserted element of the queue
		int max;
		
		public Deque() {
			max=8;
			arr=new int[max];
			front=-1;
			rear=-1;
		}
		public Deque(int m) {
			max=m;
			arr=new int[max];
			front=-1;
			rear=-1;
		}
		public void insertatbeg(int value)
		{
			if(front ==0&&rear==max-1)
			{
				System.out.println("queue is full");
			}
			else
			{
				if(front==0)
				{
					for(int i=rear;i>=front;i--)
					{	
						arr[i+1]=arr[i];
					}
					rear++;
				}
				else
				{
					if(front==-1)
						{
						front=0;
						rear=0;
						}
					else
						{
						front--;
						}
				}
				arr[front]=value;
			}
		}
		
		public void insertatend(int value)
		{
			if(front ==0&&rear==max-1)
			{
				System.out.println("queue is full");
			}
			else
			{
				if(rear==max-1)
				{
					for(int i=front;i<=rear;i++)
						arr[i-1]=arr[i];
					
					front--;
				}
				else
				{
					rear++;
					if(front==-1)
						front=0;
				}
				arr[rear]=value;
			}
		}
			
		public int deletatbeg()
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
					front++;
			}
			return val;
		}
		public int deletatend()
		{
			int val=0;
			if(front==-1)
			{
				System.out.println("queue is empty");
			}
			else
			{
				val=arr[rear];
				arr[rear]=0;
				if(front==rear)
				{
					front=-1;
					rear=-1;
				}
				else
				{
					rear--;
				}
			}
			return val;
		}
	}