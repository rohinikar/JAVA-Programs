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

public class KthSmallestBST{
	public static void main(String[] args){
		Node n1 = new Node(10);
		Node n2 = new Node(5);
		Node n3 = new Node(15);
		Node n4 = new Node(3);
		Node n5 = new Node(6);
		
		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n2.right = n5;
		
		int k = 3;
		Stack<Node> stack = new Stack<Node>();
		stack.push(n1);
		int result = -1;
		
		while(!stack.isEmpty()){
			Node curr = stack.peek();
			if(curr.left != null){
				stack.push(curr.left);
			}
			else{
				Node popped = stack.pop();
				k--;
				if(k == 0){
					result = popped.data;
					break;
				}
				stack.peek().left = null;
				if(stack.peek().right != null){
					stack.push(stack.peek().right);
				}
			}
		}
		
		System.out.println(result);
	}
}