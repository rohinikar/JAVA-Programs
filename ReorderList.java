class ListNode{
	ListNode next;
	int data;

	public ListNode(int value){
		next = null;
		data = value;
	}
}

public class ReorderList{
	
	public static void main(String[] args){
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
		ListNode n6 = new ListNode(6);
		ListNode n7 = new ListNode(7);
        
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
        n4.next = n5;
		n5.next = n6;
		n6.next = n7;
        
		
		ListNode node = reorderList(n1);
		while(node != null){
		    System.out.println(node.data);
            node = node.next;
        }

	}
	
	static ListNode reorderList(ListNode head){
	if(head == null || head.next == null || head.next.next == null)
		return head;

	ListNode p = head;
	ListNode slow = head;
	ListNode fast = head;

	while(slow.next != null && fast.next != null && fast.next.next != null){
		slow = slow.next;
		fast = fast.next.next;
	}

	ListNode reverseNode = slow.next;
	slow.next = null;
	ListNode reverse = reverse(reverseNode);
	ListNode start = head;

	while(reverse != null){
		ListNode a = start.next;
		ListNode b = reverse.next;

		start.next = reverse;
		reverse.next = a;
		start = a;
		reverse = b;
	}

	return p;


}

static ListNode reverse(ListNode node){
	if(node == null || node.next == null)
		return null;
	ListNode prev = null;

	while(node.next != null){
		ListNode p = node.next;
        node.next = prev;
        prev = node;
        node = p;
	}
    node.next = prev;
	return node;

}
}