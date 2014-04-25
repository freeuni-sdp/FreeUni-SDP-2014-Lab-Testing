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
		Integer tmp = list.remove(count-1);
		count--;
		return tmp;
	}
	
	public int count(){
		return count;
	}
}
