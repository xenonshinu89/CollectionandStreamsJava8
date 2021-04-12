package com.anchil.collectionTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		
		//String A[]={"test1","test2","test3","test3b","test4b","test4c"};
		int A[]= {5,9,10};
		int B[]= {1,2,3,4,6,7,8};
		
		String h="Hello";
		String g="Hello2";
		System.out.println(g.contains(h));
		
		
		
		System.out.println(Solution.solution(A,B));
		//System.out.println(Solution.solution(B));
		//System.out.println(Solution.solution(c));

	}
	
	static int solution(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;;
        Arrays.sort(A);
        Arrays.sort(B);
        int i = 0;
        for (int k = 0; k < n; k++) {
                while (i < m  && B[i] < A[k])
                        i += 1;
                
                if(i==m)  break;
                    

                if (A[k] == B[i])
                    return A[k];
        }
        return -1;
    }
	
	public static int solution1(String T[]) {
		
		int diff=0;
        int similar=0;
        System.out.println(T[0]+" "+T[1]);
        for(int i=0;i<=T.length-1;i++){

            for(int j=i+1;j<=T.length-1;j++){

                diff=0;
                for(int k=0;k<=T[i].length()-1;k++){
                	
                	System.out.println(T[i].charAt(k)+" "+T[j].charAt(k));
                    if(T[i].charAt(k)!=T[j].charAt(k) && (Character.isLetter(T[i].charAt(k)))){
                    
                    	System.out.println(i+" "+j+" "+k);
                        diff=T[i].length()-k;
                        break;
                        
                    }
                }
                if(diff==1){
                    similar++;
                }
                
                
            }

        }
        return similar;
		
	}

}
