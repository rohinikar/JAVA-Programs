import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Node {
    int data;
    Node left;
    Node right;
	
	public Node(int val){
	    data = val;
		left = null;
		right = null;
	}
}

public class LongestConseqSeqBinTree{
	public static void main(String[] args){
		
		Node n1 = new Node(5);
		Node n2 = new Node(4);
		Node n3 = new Node(6);
		Node n4 = new Node(3);
		Node n5 = new Node(4);
		
		n4.left = n2;
		n4.right = n5;
		n2.left = n1;
		n2.right = n3;
		
		LinkedList<Node> nodeQueue = new LinkedList<Node>();
		LinkedList<Integer> lengthQueue = new LinkedList<Integer>();
		
		nodeQueue.offer(n4);
		lengthQueue.offer(1);
		int max = 1;
		
		while(!nodeQueue.isEmpty()){
			Node currNode = nodeQueue.poll();
			int currLength = lengthQueue.poll();
			
			if(currNode.left != null){
				Node leftNode = currNode.left;
				nodeQueue.offer(leftNode);
				if(leftNode.data == currNode.data + 1){
					lengthQueue.offer(currLength + 1);
					max = Math.max(max, currLength + 1);
				}
				else{
					lengthQueue.offer(1);
				}
			}
			
			if(currNode.right != null){
				Node rightNode = currNode.right;
				nodeQueue.offer(rightNode);
				if(rightNode.data == currNode.data + 1){
					lengthQueue.offer(currLength + 1);
					max = Math.max(max, currLength + 1);
				}
				else{
					lengthQueue.offer(1);
				}
			}
		}
		
		System.out.println(max);
	}
}