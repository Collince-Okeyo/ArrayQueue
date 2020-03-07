public class ArrayQueueDemo
{
	public static void main (String[] args) 
	{
		ArrayQueue Q=new ArrayQueue();
		
		
		Q.enqueue("");
	
	    Q.front();
		Q.display();
		System.out.println("The size is: "+Q.size());
		System.out.println("Is the queue empty?: "+Q.isEmpty());
	    System.out.println("The deleted element is: "+Q.dequeue());
		System.out.println("The deleted element is: "+Q.dequeue());
		Q.display();
		System.out.println("The deleted element is: "+Q.dequeue());
		Q.display();
		System.out.println("The size is: "+Q.size());
		System.out.println("Is the queue empty?: "+Q.isEmpty());
		//System.out.println("The front element is: "+Q.front());
	//	System.out.println("The size is: "+Q.size());
		
		//Q.display();
	
    }
}