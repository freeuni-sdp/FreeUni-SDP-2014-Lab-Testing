package IntegerStack;

import java.util.LinkedList;
import java.util.List;

public class IntegerStack{
	private List<Integer> list;
	
	public IntegerStack(){
		list = new LinkedList<Integer>();
	}
	
	public void push(Integer val){
		list.add(val);
	}
	
	public Integer pop(){
		if (list.isEmpty()){
			return null;
		} else {
			return list.remove(list.size()-1);
		}
	}
	
	public Integer count(){
		return list.size();
	}
}
