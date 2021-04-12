package com.anchil.collectionTest;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapSortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			TreeMap<Integer, String> t=new TreeMap();
			t.put(20,"HI");
			t.put(10,"hello");
			t.put(15,"Si");
			t.put(1,"Yes");
			
			
			for (Map.Entry<Integer, String> pair : t.entrySet()) {
			    System.out.println( pair.getKey() +" "+ pair.getValue());
			}
			
			t.forEach((K,V)->System.out.println("K : "+K+" V : "+V));
			
			t.forEach((K,V)->System.out.println("K : "+K+" V : "+V));
			
	}

}
