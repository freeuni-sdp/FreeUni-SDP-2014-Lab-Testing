package src;

import java.util.ArrayList;

public class Queue<T> {
	
	private int size = 0;
	private T element;
	private ArrayList<T> elements = new ArrayList<T>();

	public int size() {
		return size;
	}

	public void enqueue(T element) {
		size++;
		this.element = element;
		elements.add(element);
	}

	public T dequeue() {
		if (size == 0)
			throw new EmptyQueueException();
		size--;
		
		return elements.remove(0);
	}

	public boolean isEmpty() {
		return size == 0;
	}
}