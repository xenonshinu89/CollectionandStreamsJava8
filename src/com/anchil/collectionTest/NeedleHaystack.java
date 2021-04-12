package com.anchil.collectionTest;

import java.util.List;
import java.util.ArrayList;

public class NeedleHaystack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> found=solution("abc","aaabcdddddeeffabcabddddd");
		found.forEach(s->System.out.println(s));

	}
	
	public static List<Integer> solution(String needle,String haystack) {
		
		
		
		int p=0;
		List<Integer> found=new ArrayList<Integer>();
		
		if(needle==null || haystack== null) {
			return found;
		}
		else if(needle.length()==0 || haystack.length()==0) {
			return found;
		}
		else if(needle.length()>haystack.length()) {
			return found;
		}
			
		while(p<haystack.length()) {
			
			if(needle.charAt(0)==haystack.charAt(p)) {
				
				if(compareString(p,needle,haystack)) {
					found.add(p);
				}
			}
			p++;
		}
		
		return found;
		
	}
	
	public static boolean compareString(int p,String needle,String haystack) {
		
		boolean equalString=true;
		int p2=0;
		while(p2<needle.length()) {
			if(needle.charAt(p2)==haystack.charAt(p)) {
				p2++;
				p++;
			}
			else {
				equalString=false;
				break;
			}
		}
		return equalString;
	}

}
