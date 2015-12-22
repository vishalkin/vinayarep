package queue;

public class TestQueue {

	public static void main(String[] args) {
		 //TODO Auto-generated method stub
		QueueArray queue1 = new QueueArray();  
		
		QueueArrayList queue2= new QueueArrayList();
	
		
		QueueLinkedList queue3=new QueueLinkedList();
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
