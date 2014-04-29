import java.util.ArrayList;
import java.util.List;


public class MultiMap<K, V extends List<?>> {
	
	private ArrayList<K> keys;
	private ArrayList<V> values;
	
	public MultiMap(){
		keys = new ArrayList<K>();
		values = new ArrayList<V>();
	}
	
	public int size(){
		return keys.size();
	}
	
	public void put(K key, V value){
		if(key == null || value == null)
			throw new NullPointerException("Key and Value must not be null");
		keys.add(key);
		values.add(value);
	}
	
	public List<K> get(){
		return (List<K>) keys.clone();
	}
	
	public int valueCount(){
		int counter = 0;
		for(int i = 0; i < values.size(); i++)
			counter += values.get(i).size();
		return counter;
	}
	
	public boolean isEmpty(){
		return keys.size() == 0;
	}
}
