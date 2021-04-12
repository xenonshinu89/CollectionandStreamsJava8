package com.anchil.collectionTest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class CollectionTest {
	
	public static void main(String args[]) {
		
		HashSet<String> hs=new HashSet<String>();
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		TreeSet<String> ts=new TreeSet<String>();
		
		
		for(String s:Arrays.asList("Geek2","Geek1","Geek3")) {
			
			hs.add(s);
			lhs.add(s);
			ts.add(s);
			
		}
	
		System.out.println("HashSet");
		for(String s:hs) {
			System.out.println(s);
		}
		
		System.out.println("LinkedHashSet");
		for(String s:lhs) {
			System.out.println(s);
		}
		
		System.out.println("TreeSet");
		for(String s:ts) {
			System.out.println(s);
		}
		
	}
	

}
