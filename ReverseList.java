public class ListNode{
	ListNode next;
	int data;

	public ListNode(int value){
		next = null;
		data = value;
	}
}


public class ReverseList{
	public static void main(String[] args){
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
        n4.next = n5;

		ListNode node = reverse(n1);
		while(node != null){
		    System.out.println(node.data);
            node = node.next;
        }
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