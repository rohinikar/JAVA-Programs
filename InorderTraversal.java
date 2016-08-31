/* you only have to complete the function given below.  
Node is defined as  

class Node {
    int data;
    Node left;
    Node right;
}

*/

void inOrder(Node root) {
    Stack<Node> stack = new Stack<Node>();
    stack.push(root);
    
    while(!stack.isEmpty()){
        Node curr = stack.peek();
        if(curr.left != null){
            stack.push(curr.left);
        }
        else{
            Node popped = stack.pop();
            System.out.print(popped.data + " ");
            if(!stack.isEmpty())
                stack.peek().left = null;
            if(popped.right != null){
                stack.push(popped.right);
            }
        }
    }

}
