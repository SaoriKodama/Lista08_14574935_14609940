package usp.mac321.ex3;

import java.util.Stack;

public class Element04<T> {
	private Stack<T> stack = new Stack<T>();
	
	public void add(T element) {
		stack.push(element);
	}

	public boolean equals(Element04<T> m) {
		return stack.containsAll(m.stack);
	}
	
	public void addAll(Element04<T> m) {
		stack.addAll(m.stack);
	}
	
	public Stack<T> getList() {
		return stack;
	}
}
