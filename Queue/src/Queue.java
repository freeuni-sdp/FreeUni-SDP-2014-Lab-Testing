package src;

public class Queue<T> {
	
	private int size = 0;

	public int size() {
		return size;
	}

	public void enqueue(T element) {
		size++;
	}

	public void dequeue() {
		size--;
	}

	public boolean isEmpty() {
		return true;
	}
}