package queue;

import java.util.ArrayList;

public class QueueArrayList {
	ArrayList<Integer> a=new ArrayList<Integer>(); 
	 
	 public void enqueue(int element) {  	  
		  a.add(element);    
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

public void dequeue() {  
	  
	 if(a.isEmpty()) {  
		   System.out.println("Cannot pop..queue is empty !");  
		  }
	 else{
		  a.remove(0);
	 }
	 }  
}
