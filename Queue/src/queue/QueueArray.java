package queue;

public class QueueArray implements Queue {
	private static final int capacity = 3;  
	int arr[] = new int[capacity];  
	int front = -1, rear = 0;  

	public boolean enqueue(int element) {  
		if (front < capacity-1) {  
			front++;  
			arr[front] = element;   
			return true;
		} 
		
		else {  
			//System.out.println("Cannot push..queue is full !");  
			return false;
		}  
		

	}  

	public boolean dequeue() {  
		if (front >= rear) {  
			rear++;  
			return true;
		} 
		
		else {  
			//System.out.println("Cannot pop..queue is empty !");  
			return false;
		}  
		
	}  

	public void display() {  
		if (front > rear) {  
			System.out.println("Elements in the Queue : ");  
			for (int i = rear; i <= front; i++) {  
				System.out.println(arr[i]);  
			}  
		}
		else{
			System.out.println("No elemets in the queue");
		}
	}
}
