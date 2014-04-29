import java.util.ArrayList;
import java.util.List;


public class MultiMap<K, V extends List<?>> {
	
	private ArrayList<K> keys;
	private ArrayList<V> values;
	private int valueCounter;
	
	public MultiMap(){
		keys = new ArrayList<K>();
		values = new ArrayList<V>();
		valueCounter = 0;
	}
	
	public int size(){
		return keys.size();
	}
	
	public void put(K key, V value){
		if(key == null || value == null)
			throw new NullPointerException("Key and Value must not be null");
		if(!keys.contains(key)){
			keys.add(key);
			values.add(value);
			valueCounter += value.size();
		}else{
			int keyPos = keys.indexOf(key);
			valueCounter += value.size() - values.get(keyPos).size();
			values.set(keyPos, value);
		}
	}
	
	public List<K> get(){
		return (List<K>) keys.clone();
	}
	
	public int valueCount(){
		return valueCounter;
	}
	
	public boolean isEmpty(){
		return keys.size() == 0;
	}
}
