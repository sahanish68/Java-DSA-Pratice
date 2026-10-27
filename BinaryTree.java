public class BinaryTree {
    static class Node{
        int  data;
        Node left;
        Node right;

        Node(int data) {
            this.data=data;
            this.left=null;
            this.right=null;

        }
    }


    static class Binary{
        static int idx=-1; 
        public static Node buildTree(int node[]){
            idx++;
            if(node[idx]==-1){
                return null;
            }

            Node newNode=new Node(node[idx]);
            newNode.left=buildTree(node);   
            newNode.right=buildTree(node);


            return newNode;


        }


    }

    public static void preorder(Node root){
        if(root==null){
          return;

        }
        System.out.println(root.data+" ");
        preorder(root.left);
        preorder(root.right);

    }


    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);

    }

    public static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }




    public static void levelOrder(Node root){
        if(root==null){
            return; 
        }
        java.util.Queue<Node> q= new java.util.LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode=q.remove();
            if(currNode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;

                }else{
                    q.add(null);
                }
            }else{
                System.out.println(currNode.data+" ");
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }
    }

    public static int countNodes(Node root){
        if(root==null){
            return 0;
        }
        int leftNodes=countNodes(root.left);
        int rightNodes=countNodes(root.right);

        return leftNodes+rightNodes+1;
    }

    public static int sumOfNodes(Node root){
        if(root==null){
            return 0;
        }
        int leftSum=sumOfNodes(root.left);
        int rightSum=sumOfNodes(root.right);

        return leftSum+rightSum+root.data;
    }


    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);

        return Math.max(leftHeight,rightHeight)+1;
    }




    public static void main(String[] args) {
        int node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binary tree=new Binary();
        Node root = tree.buildTree(node);

        System.out.println("Number of nodes: "+countNodes(root));
        System.out.println("Sum of nodes: "+sumOfNodes(root));
        System.out.println("Height of tree: "+height(root));
        // levelOrder(root);
    }

   

    
}
