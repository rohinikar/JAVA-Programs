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

class RemDupSortedList{
	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(1);
		Node n3 = new Node(2);
		Node n4 = new Node(3);
		Node n5 = new Node(3);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;

		Node res = removeDups(n1);
		while(res != null){
			System.out.println(res.value);
			res = res.next;
		}
	}

	public static Node removeDups(Node n){
		if((n == null) || (n.next == null)){
			return n;
		}
		Node head = n;
		Node prev = n;
		Node curr = n.next;

		while(curr != null){
			if(curr.value != prev.value){
				prev.next = curr;
				Node temp = curr.next;
				prev = curr;
				curr = temp;
			}
			else{
				curr = curr.next;
				if(curr == null){
					prev.next = curr;
				}
			}
		}

		return head;
	}
}