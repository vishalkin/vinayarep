package queue;

public interface Queue {
	public boolean enqueue(int element);
	public boolean dequeue();
	public void display();
}
