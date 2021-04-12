package com.anchil.collectionTest;

import java.util.Arrays;

import com.anchil.collectionTest.Tree.Node;

public class ConvertSortedArraytoBinarySearchTree {

	Treenode root; 
	
	// Tree Node 
    static class Treenode { 
        int data; 
        Treenode left, right; 
        Treenode(int data) 
        { 
            this.data = data; 
            this.left = null; 
            this.right = null; 
        } 
    } 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
        int arr[] = { -3,10,11,13,15,-1,0,8,7};
        Arrays.sort(arr);
        Treenode t=insertBST(arr,0,arr.length-1);
        inOrder(t);
        inOrderIndent(t,0);
        System.out.println("\n\n");
        inOrderIndentnew(t,(int)arr.length/2);
	}

	private static Treenode insertBST(int[] arr,int left,int right) {
		// TODO Auto-generated method stub
		
		if(left>right) return null;
		int midpoint=left+(right-left)/2;
		Treenode node=new Treenode(arr[midpoint]);
		System.out.println(new String(new char[midpoint]).replace("\0", "      ")+arr[midpoint]); 
		node.left=insertBST(arr,left,midpoint-1);
		node.right=insertBST(arr,midpoint+1,right);
		
		return node;
		
	}
	public static void inOrderIndent(Treenode root,int depth) {
		
		if (root != null) { 
			
			inOrderIndent(root.right,depth+1);
			System.out.println(new String(new char[depth]).replace("\0", "      ")+root.data); 
			inOrderIndent(root.left,depth+1);
			
			
		}
		
	}
	public static void inOrder(Treenode root) 
    { 
        if (root != null) { 
            inOrder(root.left); 
            System.out.println(root.data + " "); 
            inOrder(root.right); 
        } 
    } 
	
	public static void inOrderIndentnew(Treenode root,int depth) {
		
		if (root != null) { 
			
			
			inOrderIndentnew(root.left,depth-1);
			System.out.println(new String(new char[depth]).replace("\0", "      ")+root.data);
			inOrderIndentnew(root.right,depth-1);
			
			
			
		}
		
	}

}
