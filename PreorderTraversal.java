/* you only have to complete the function given below.  
Node is defined as  

class Node {
    int data;
    Node left;
    Node right;
}

*/

void preOrder(Node root) {
    Stack<Node> stack = new Stack<Node>();
    stack.push(root);
    
    while(!stack.isEmpty()){
        Node curr = stack.pop();
        System.out.print(curr.data + " ");
        if(curr.right != null){
            stack.push(curr.right);
        }
        if(curr.left != null){
            stack.push(curr.left);
        }
    }
}