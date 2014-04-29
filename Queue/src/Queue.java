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
		if (size == 0)
			throw new EmptyQueueException();
		size--;
	}

	public boolean isEmpty() {
		return size == 0;
	}
}