import java.util.ArrayList;
public class BST {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static Node insert(Node root  ,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data>val){
            //left tree
            root.left=insert(root.left, val);
        }else{
            root.right=insert(root.right, val);
        }

        return root;

    }

    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);

    }

    public static boolean search(Node root , int key){
        if(root==null){
            return false;
        }
        if(root.data>key){
            return search(root.left, key);
        }else if(root.data==key){
            return true;
        }else{
            return search(root.right, key);
        }
    }

    public static Node printInRange(Node root ,int X ,int Y){
        if(root==null){
            return null;
        }
        if(root.data>=X && root.data<=Y){
            System.out.print(root.data+" ");
        }
        if(root.data>X){
            printInRange(root.left, X, Y);
        }
        if(root.data<Y){
            printInRange(root.right, X, Y);
        }
        return root;
    }

    public static Node delete(Node root , int val){
        if(root.data>val){
            root.left=delete(root.left, val);
        }else if(root.data<val){
            root.right=delete(root.right, val);
        }else{
            //case 1
            if(root.left==null && root.right==null){
                return null;
            }
            //case 2
            if(root.left==null){
                return root.right;
            }else if(root.right==null){
                return root.left;
            }

            //case 3
            Node IS= findInorderSuccessor(root.right);
            root.data=IS.data;
            root.right=delete(root.right, IS.data);
        }
        return root;
    }
    public static Node findInorderSuccessor(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }

    public static void printPath(ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println("null");
    }

    public static void printRoot2Leaf(Node root ,ArrayList<Integer> path){
        if(root==null){
            return;
        }
        path.add(root.data);
        if(root.left==null && root.right==null){
            printPath(path);
        }else{
            printRoot2Leaf(root.left, path);
            printRoot2Leaf(root.right, path);
        }
        path.remove(path.size()-1);
    }
    
    public static void main (String[] args){
        int values[] ={5,1,3,4,2,7,6,8};
        Node root=null;

        for(int i=0;i<values.length;i++){
            root=insert(root, values[i]);
        }

        inorder(root);
        System.out.println("\n");

        if(search(root, 6)){
            System.out.println("found");
        }else{
            System.out.println("not found");
        }

        delete(root, 3);
        inorder(root);
        System.out.println("\n");
        printInRange(root, 1, 6);
        printRoot2Leaf(root, new ArrayList<>());
    }
}
