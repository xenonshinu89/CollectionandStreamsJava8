package com.anchil.collectionTest;

public class PalindromicString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(solution("racecar"));

	}
	
	public static boolean solution(String s) {
		
		boolean palindromicString=true;
		for(int i=0,j=s.length()-1;i<=j;i++,j--) {
			
			if(s.charAt(i)!=s.charAt(j)) {
				palindromicString=false;
				break;
			}
			
		}
		
		return palindromicString;
		
	}

}
