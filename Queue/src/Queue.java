package src;

import java.util.ArrayList;

public class Queue<T> {
	
	private ArrayList<T> elements = new ArrayList<T>();
	private static final int FIRST_ITEM_IN_QUEUE = 0;

	public int size() {
		return elements.size();
	}

	public void enqueue(T element) {
		elements.add(element);
	}

	public T dequeue() {
		if (elements.isEmpty())
			throw new EmptyQueueException();
		
		return elements.remove(FIRST_ITEM_IN_QUEUE);
	}

	public boolean isEmpty() {
		return elements.isEmpty();
	}
}