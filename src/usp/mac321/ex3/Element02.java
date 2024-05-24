package usp.mac321.ex3;

import java.util.HashSet;
import java.util.Set;

public class Element02<T> {
	private Set<T> hashSet = new HashSet<T>();
	
	public void add(T element) {
		hashSet.add(element);
	}

	public boolean equals(Element02<T> m) {
		return hashSet.containsAll(m.hashSet);
	}
	
	public void addAll(Element02<T> m) {
		hashSet.addAll(m.hashSet);
	}
	
	public Set<T> getList() {
		return hashSet;
	}
}
