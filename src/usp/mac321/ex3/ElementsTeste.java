package usp.mac321.ex3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.*;

public class ElementsTeste {
	@Test
    public void testElement01ArrayList() {
        Element01<Integer> list01 = new Element01<>();
        list01.add(1);
        list01.add(2);
        
        Element01<Integer> list02 = new Element01<>();
        list02.add(3);
        list02.add(4);
        
        list01.addAll(list02);

        assertTrue(list01.equals(list02));
    }
	
	@Test
	public void testElement02HashSet() {
		Element02<String> list01 = new Element02<>();
        list01.add("A");
        list01.add("B");
        
        Element02<String> list02 = new Element02<>();
        list02.add("C");
        list02.add("D");
        
        list01.addAll(list02);

        assertTrue(list01.equals(list02));
	}
	
	@Test
	public void testElement03LinkedList() {
		Element03<Double> list01 = new Element03<>();
        list01.add(1.1);
        list01.add(1.2);
        
        Element03<Double> list02 = new Element03<>();
        list02.add(2.1);
        list02.add(2.2);
        
        list01.addAll(list02);

        assertTrue(list01.equals(list02));
	}
	
	@Test
	public void testElement04Stack() {
		Element04<Integer> list01 = new Element04<>();
        list01.add(1);
        list01.add(2);
        
        Element04<Integer> list02 = new Element04<>();
        list02.add(3);
        list02.add(4);
        
        list01.addAll(list02);

        assertTrue(list01.equals(list02));
	}
}
