import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Set;

public class StringSet {
	private ArrayList<String> set;

	public StringSet() {
		set = new ArrayList<String>();
	}

	public void add(String elem) {
		if (!set.contains(elem))
			set.add(elem);
	}

	public boolean contains(String elem) {
		return set.contains(elem);

	}

	public boolean remove(String elem) {
		return set.remove(elem);
	}

	public int count() {
		return set.size();
	}

	public void union(Set<String> s) {
		Iterator iter = s.iterator();
		while (iter.hasNext()) {
			String elem = (String) iter.next();
			if (!set.contains(elem))
				set.add(elem);
		}
	}

	public void intersection(Set<String> s) {
		ArrayList<String> helper = new ArrayList<String>();
		Iterator iter = s.iterator();
		while (iter.hasNext()) {
			String elem = (String) iter.next();
			if (set.contains(elem))
				helper.add(elem);
		}
		set = helper;
	}

	public void clear() {
		set.clear();

	}

	public Enumeration<String> enumerator() {
		return Collections.enumeration(set);

	}

}
