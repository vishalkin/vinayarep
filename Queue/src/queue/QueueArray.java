package queue;

public class QueueArray {
	 private static final int capacity = 3;  
	 int arr[] = new int[capacity];  
	 int front = -1, rear = 0;  
	  
	 public void enqueue(int element) {  
	  if (front < capacity-1) {  
	   front++;  
	   arr[front] = element;   
	  } 
	  else {  
	   System.out.println("Cannot push..queue is full !");  
	  }  
	  
	 }  
	  
	 public void dequeue() {  
	  if (front >= rear) {  
	   rear++;  
	  } 
	  else {  
	   System.out.println("Cannot pop..queue is empty !");  
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
