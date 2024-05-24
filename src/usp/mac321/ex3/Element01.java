package usp.mac321.ex3;

import java.util.ArrayList;

public class Element01<T> {
	private ArrayList<T> arrayList = new ArrayList<T>();
	
	public void add(T element) {
		arrayList.add(element);
	}
	
	public boolean equals(Element01<T> m) {
		return arrayList.containsAll(m.arrayList);
	}
	
	public void addAll(Element01<T> list02) {
		arrayList.addAll(list02.arrayList);
	}
	
	public ArrayList<T> getList() {
		return arrayList;
	}
}
