package com.anchil.collectionTest;

public class RunLengthEncoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(solution("aaaabbcccad"));
			
	}
	
	public static String solution(String s) {
		
		StringBuilder sb=new StringBuilder();
		char prev=0;
		int counter=0;
		for(int i=0;i<s.length();i++) {
			if(prev==s.charAt(i)) {
				counter++;
			}else if(prev!=0){
				sb.append(counter+""+prev);
				prev=s.charAt(i);
				counter=1;
			}
			else {
				prev=s.charAt(i);
				counter=1;
			}
			
		}
		sb.append(counter+""+prev);
		return sb.toString();
		
	}

}
