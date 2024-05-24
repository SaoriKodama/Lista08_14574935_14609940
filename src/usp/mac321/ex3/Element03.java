package usp.mac321.ex3;

import java.util.LinkedList;

public class Element03<T> {
	private LinkedList<T> linkedList = new LinkedList<T>();
	
	public void add(T element) {
		linkedList.push(element);
	}
	
	public boolean equals(Element03<T> m) {
		return linkedList.containsAll(m.linkedList);
	}
	
	public void addAll(Element03<T> m) {
		linkedList.addAll(m.linkedList);
	}
	
	public LinkedList<T> getList() {
		return linkedList;
	}
}
