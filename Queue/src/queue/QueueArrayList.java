package queue;

import java.util.ArrayList;

public class QueueArrayList implements Queue {
	ArrayList<Integer> a=new ArrayList<Integer>(); 

	public boolean enqueue(int element) {  	  
		a.add(element);    
		return true;
	} 


	public void display() {  

		if(a.isEmpty()) {  
			System.out.println("No elemets in the queue ");  
		}
		else{ 
			System.out.println("Elements in the Queue : ");  
			for(int obj:a)  {
				System.out.println(obj);  
			} 
		}  
	}

	public boolean dequeue() {  

		if(a.isEmpty()) {  
			//System.out.println("Cannot pop..queue is empty !");  
			return false;
		}
		else{
			a.remove(0);
			return true;
		}
	}  
}
