import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Node{
	int value;
	Node next;
	public Node(int v){
		value = v;
		next = null;
	}
}

class SwapNodePair{
	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		

		Node res = swapNodesInPair(n1);
		while(res != null){
			System.out.println(res.value);
			res = res.next;
		}
	}

	public static Node swapNodesInPair(Node n){
		if((n == null) || (n.next == null)){
			return n;
		}

		Node head = n.next;
		Node prev = null;
		while((n != null) && (n.next != null)){
			Node node = n.next.next;
			Node temp = n.next;
			temp.next = n;
			n.next = node;
			if(prev != null){
				prev.next = temp;
			}
			prev = n;
			n = n.next;
		}

		return head;
	}
}