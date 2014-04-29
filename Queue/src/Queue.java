package src;

public class Queue<T> {
	
	private int size = 0;
	private T element;

	public int size() {
		return size;
	}

	public void enqueue(T element) {
		size++;
		this.element = element;
	}

	public T dequeue() {
		if (size == 0)
			throw new EmptyQueueException();
		size--;
		
		return element;
	}

	public boolean isEmpty() {
		return size == 0;
	}
}