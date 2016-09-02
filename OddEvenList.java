class ListNode{
	ListNode next;
	int data;

	public ListNode(int value){
		next = null;
		data = value;
	}
}

public class OddEvenList{
	
	public static void main(String[] args){
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
		ListNode n6 = new ListNode(6);
		ListNode n7 = new ListNode(7);
        ListNode n8 = new ListNode(8);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
        n4.next = n5;
		n5.next = n6;
		n6.next = n7;
        n7.next = n8;
		
		ListNode node = oddEvenList(n1);
		while(node != null){
		    System.out.println(node.data);
            node = node.next;
        }

	}
	
	static ListNode oddEvenList(ListNode head){
	if(head == null)
		return null;
	else if(head.next == null || head.next.next == null)
		return head;

	ListNode p = head;
	ListNode q = head.next;
	ListNode odd = head;
	ListNode even = head.next;
	
	while(odd.next.next != null && even.next.next != null){
		ListNode a = odd.next.next;
        ListNode b = even.next.next;
       
        odd.next = a;
        even.next = b;
       
        odd = odd.next;
        even = even.next;
            
	}
      if(odd.next.next != null){
        odd.next = odd.next.next;
        odd = odd.next;
        even.next = null;
      }
      odd.next = q;

	return p;


    }
}