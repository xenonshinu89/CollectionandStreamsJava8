package com.anchil.collectionTest;

public class Tree { 
    Node root; 
  
    // Tree Node 
    static class Node { 
        int data; 
        Node left, right; 
        Node(int data) 
        { 
            this.data = data; 
            this.left = null; 
            this.right = null; 
        } 
    } 
  
    // Function to insert nodes in level order 
    public Node insertLevelOrder(int[] arr, Node root, 
                                                int i) 
    { 
        // Base case for recursion 
        if (i < arr.length) { 
            Node temp = new Node(arr[i]); 
            root = temp; 
  
            // insert left child 
            root.left = insertLevelOrder(arr, root.left, 
                                             2 * i + 1); 
  
            // insert right child 
            root.right = insertLevelOrder(arr, root.right, 
                                               2 * i + 2); 
        } 
        return root; 
    } 
    static int countNonleaf(Node root)  
    {  
        // Base cases.  
    	
    	
        if (root == null || (root.left == null &&  
                            root.right == null))  
            return 0;  
      
        // If root is Not NULL and its one of its  
        // child is also not NULL  
        return 1 + countNonleaf(root.left) +  
                    countNonleaf(root.right);  
    }
  
    // Function to print tree nodes in InOrder fashion 
    public void inOrder(Node root) 
    { 
        if (root != null) { 
            inOrder(root.left); 
            //System.out.print(root.data + " "); 
            inOrder(root.right); 
        } 
    } 
  
    // Driver program to test above function 
    public static void main(String args[]) 
    { 
        Tree t2 = new Tree(); 
        int arr[] = { 1, 2, 3, 4, 5, 6, 6, 6, 6 ,6}; 
        t2.root = t2.insertLevelOrder(arr, t2.root, 0); 
        t2.inOrder(t2.root); 
        
        System.out.print(t2.countNonleaf(t2.root));
    } 
}
