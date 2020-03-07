import java.util.Scanner;
public class ArrayQueue implements Queue
{
	private String queue[];
    private  int f;
    private  int r;
	int size;
	int capacity;
	Scanner sc=new Scanner(System.in);
	
	public ArrayQueue()
	{
		queue=new String[1000];
		f=0;
		r=0;
	}
	
	public ArrayQueue(int capacity)
	{
		queue=new String[capacity];
		f=0;
		r=0;
	}

		public void enqueue(String object)
	{
		System.out.println("Enter the array size");
	    capacity=sc.nextInt();
		System.out.println("Enter the objects: ");
		for(int i=0;i<capacity;i++)
		{
	   	object=sc.next();
		
         queue[r]=object;
         r=(r+1)%capacity;
         size=size+1;
		}
	
	}
	
	public void display()
	{
		if(isEmpty())
		{
			System.out.println("No elements to display");
		}
		else
		{
		System.out.println("Elements entered are: ");
		for(int i=0;i<size;i++)
		{
			System.out.println(queue[f+i]+" ");
		}
		}
	}
	
	public boolean isEmpty()
	{
	  return size==0;
	}

	
	public int size()
	{
		return size;
	}
	
	public Object front()
	{
		if(isEmpty())
		{
			System.out.println("ERROR");
			
		}
		else
		{
			System.out.println("The front object is: "+queue[f]);
		}
			return queue[f];	
	}
	
	public Object dequeue()
	{
	  Object temp = null;
	  if(isEmpty())
	  {
	  	System.out.println("ERROR");
	  	
	  }
	  else
	  {
	 temp =queue[f];
	   queue[f]=null;
	   f=(f+1)%capacity;
	   size=size-1;
	   
	  }
	  return temp;
	}	
	
}