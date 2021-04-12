package com.anchil.collectionTest;

public class SortingAlg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,5,20,15,6,1,-1};
		
		int b[]=bubbleSort(a);
		
		
		for(int x : b) {
			System.out.println(x);
		}

	}

	public static int[] bubbleSort(int[] a) {
	    boolean sorted = false;
	    int temp;
	    while(!sorted) {
	        sorted = true;
	        for (int i = 0; i < a.length - 1; i++) {
	            if (a[i] > a[i+1]) {
	                temp = a[i];
	                a[i] = a[i+1];
	                a[i+1] = temp;
	                sorted = false;
	            }
	        }
	    }
	    
	    return a;
	}
	
}
