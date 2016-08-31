void invertBinaryTree(Node root){
    if(root == null)
	    return;
	
	Stack<Node> stack = new Stack<Node>();
	stack.push(root);
	
	while(!stack.isEmpty()){
	    Node curr = stack.pop();
		if((curr.left != null) || (curr.right != null)){
		    Node leftChild = curr.left;
			Node rightChild = curr.right;
			curr.right = leftChild;
			curr.left = rightChild;
			
			if(curr.left != null){
			    stack.push(curr.left);
			}
			if(curr.right != null){
			    stack.push(curr.right);
			}
		}
	}
}