package IntegerStack;

import java.util.LinkedList;
import java.util.List;

public class IntegerStack{
	private List<Integer> list;
	private int count;
	
	public IntegerStack(){
		list = new LinkedList<Integer>();
		count = 0;
	}
	
	public void push(Integer item){
		list.add(item);
		count++;
	}
	
	public Integer pop(){
		if (count == 0)
			return null;
		return list.remove(--count);
	}
	
	public int count(){
		return count;
	}
}
