package queue;

public class TestQueue {

	public static void main(String[] args) {
		 //TODO Auto-generated method stub
		Queue queue1 = new QueueArray();  
		
		Queue queue2= new QueueArrayList();
	
		Queue queue3=new QueueLinkedList();
		queue3.enqueue(21);
		queue3.enqueue(22);
		queue3.enqueue(23);
		queue3.enqueue(24);
		queue3.enqueue(25);
		queue3.display();
		
		queue3.dequeue();
		queue3.dequeue();
		queue3.display();
		
		queue3.enqueue(26);
		queue3.display();
		
	}

}
