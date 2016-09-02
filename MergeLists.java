class ListNode{
	ListNode next;
	int data;

	public ListNode(int value){
		next = null;
		data = value;
	}
}

public class MergeLists{
	
	public static void main(String[] args){
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(8);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		
		ListNode n5 = new ListNode(2);
		ListNode n6 = new ListNode(4);
		ListNode n7 = new ListNode(6);
		ListNode n8 = new ListNode(7);
		n5.next = n6;
		n6.next = n7;
		n7.next = n8;
		
		ListNode node = mergeLists(n1, n5);
		while(node != null){
		    System.out.println(node.data);
            node = node.next;
        }
	}
static ListNode mergeLists(ListNode head1, ListNode head2){
	if(head1 == null && head2 == null)
		return null;
	else if(head1 == null)
		return head2;
	else if(head2 == null)
		return head1;

	
	ListNode head = new ListNode(0);
	ListNode curr;
	if(head1.data < head2.data){
		head.next = head1;
		curr = head1;
		head1 = head1.next;
	}
	else{
		head.next = head2;
		curr = head2;
		head2 = head2.next;
	}
	

	while(head1 != null && head2 != null){
		if(head1.data < head2.data){
			curr.next = head1;
			head1 = head1.next;
		}
		else{
			curr.next = head2;
			head2 = head2.next;
		}
		curr = curr.next;
	}

	if(head2 != null)
		curr.next = head2;
	if(head1 != null)
		curr.next = head1;

	return head.next;


}
}