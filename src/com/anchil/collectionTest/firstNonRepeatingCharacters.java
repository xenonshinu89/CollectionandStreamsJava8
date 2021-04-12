package com.anchil.collectionTest;

import java.util.HashMap;
import java.util.Map;

public class firstNonRepeatingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aaa1bbcccddeeeeff";
		System.out.println(solution(s));
		
	}
	public static char solution(String s) {
		
		int m=0;
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		
		if(s!=null) {
			if(s.length()!=0) {
				for(int i=0;i<s.length();i++) {
					
					if(map.containsKey(s.charAt(i))) {
						
						m=map.get(s.charAt(i));
						m+=1;
						map.put(s.charAt(i),m);
					}
					else {
						map.put(s.charAt(i),1);
					}
					
				}
				
				for(Map.Entry<Character, Integer> entry:map.entrySet()) {
					
					if(entry.getValue().equals(1)) {
						return entry.getKey();
					}
					
				}
			}
		}
		return 0;
		
	}

}
