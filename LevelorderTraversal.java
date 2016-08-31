 /* 
    
    class Node 
       int data;
       Node left;
       Node right;
   */
   void LevelOrder(Node root)
    {
       LinkedList<Node> queue = new LinkedList<Node>();
       ArrayList<Integer> result = new ArrayList<Integer>();
       queue.add(root);
       while(!queue.isEmpty()){
           LinkedList<Node> children = new LinkedList<Node>();
           while(!queue.isEmpty()){
               Node curr = queue.remove();
               result.add(curr.data);
               if(curr.left != null)
                   children.add(curr.left);
               if(curr.right != null)
                   children.add(curr.right);
           }
           queue = children;
       }
       
       for(int i = 0; i < result.size(); i++){
           System.out.print(result.get(i) + " ");
       }
      
      
    }