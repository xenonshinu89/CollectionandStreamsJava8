package com.anchil.collectionTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

enum Level {
	  LOW,
	  MEDIUM,
	  HIGH
	}

public class CollectionsTest2 {

	public static void main(String[] args) {
		
		List al=new ArrayList();
		List ll=new LinkedList();
		Vector v=new Vector();
		
		
		
		Enumeration e=v.elements();
		
			for(Object o:Arrays.asList("Geek2","Geek1","Tom","Mary","Abey")){
				
				al.add(o);
				ll.add(o);
				v.add(o);
				
			}
			
			System.out.println("ArrayList");
			for(Object s:al) {
				System.out.println(s);
			}
			
			System.out.println("LinkedList");
			for(Object s:ll) {
				System.out.println(s);
			}
			
			
		
			System.out.println("Vector Enumeration");
			while(e.hasMoreElements()) {
				System.out.println(e.nextElement());
			}
			
			ll.forEach(s->System.out.println(s));
			
			System.out.println("Vector");
			for(Object s:v) {
				System.out.println(s);
			}
			
			
			al.add(1,"Shinu");
			ll.add(2,"Shinu");
			
			ll.remove(4);
			
			
			System.out.println("ArrayList");
			for(Object s:al) {
				System.out.println(s);
			}
			
			System.out.println("LinkedList");
			for(Object s:ll) {
				System.out.println(s);
			}
			
			
			Map hm=new HashMap();  
		    //Adding elements to map  
		    hm.put(1,"Amit");  
		    hm.put(5,"Rahul");  
		    hm.put(2,"Jai");  
		    hm.put(6,"Amit");  
		    hm.put(6,"Harish");
		    hm.put(null, null);
		   
		    Map lm=new LinkedHashMap();  
		    //Adding elements to map  
		    lm.put(1,"Amit");  
		    lm.put(5,"Rahul");  
		    lm.put(2,"Jai");  
		    lm.put(6,"Amit"); 
		    lm.put(6,"Harish");
		    
		    Map tm=new TreeMap();  
		    //Adding elements to map  
		    tm.put(1,"Amit");  
		    tm.put(5,"Rahul");  
		    tm.put(2,"Jai");  
		    tm.put(6,"Amit"); 
		    tm.put(6,"Harish");
		    
		    Map ht=new Hashtable();
		    ht.put(1,"Amit");  
		    ht.put(5,"Rahul");  
		    ht.put(2,"Jai");  
		    ht.put(6,"Amit"); 
		    ht.put(6,"Harish");
		    //ht.put(null, "HI");
		    
		    System.out.println("Hash Map");
		    hm.forEach((K,V)->System.out.println(K+" "+V));
		    
		    System.out.println("Linked Hash Map");
		    lm.forEach((K,V)->System.out.println(K+" "+V));
		    
		    System.out.println("Tree Map");
		    tm.forEach((K,V)->System.out.println(K+" "+V));
		    
		    System.out.println("Hash Table");
		    ht.forEach((K,V)->System.out.println(K+" "+V));
			
	}

}
