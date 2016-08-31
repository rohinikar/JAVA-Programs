/* you only have to complete the function given below.  
Node is defined as  

class Node {
    int data;
    Node left;
    Node right;
}

*/
void postOrder(Node root) {
    Stack<Node> stack = new Stack<Node>();
    stack.push(root);
    
    while(!stack.isEmpty()){
        Node curr = stack.peek();
        if((curr.left == null) && (curr.right == null)){
            Node popped = stack.pop();
            System.out.print(popped.data + " ");
            if(stack.peek().left == popped)
                stack.peek().left = null;
            else if(stack.peek().right == popped)
                stack.peek().right = null;
        }
        else if(curr.left != null){
            stack.push(curr.left);
        }
        else{
            if(curr.right != null){
                stack.push(curr.right);
            }
        }
    }

}
