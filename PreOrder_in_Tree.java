package DataStructure.Examly;

import java.util.Scanner;

public class PreOrder_in_Tree {
    Node root;

    private class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    public void insert(int value) {
        Node node = new Node(value);
        if (root == null) {
            root = node;
            root.left = null;
            root.right = null;
        } else {
            var current = root;
            while (true) {
                if (current.value > value) {
                    if (current.left == null) {
                        current.left = node;
                        break;
                    }
                    current = current.left;
                } else {
                    if (current.right == null) {
                        current.right = node;
                        break;
                    }
                    current = current.right;
                }
            }
        }
    }

    public boolean find(int value) {
        var current = root;
        while (current != null) {
            if (value == current.value) {
                return true;
            }
            if (value > current.value) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return false;
    }

    public void preOrderTraversal() {
        preOrderTraversal(root);
    }

    private void preOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.value + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public void postOrderTraversal(){
        postOrderTraversal(root);
    }
    private void postOrderTraversal(Node root){
        if(root==null)
            return;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.value+" ");


    }
}

class Main2 {
    public static void main(String[] args) {
        PreOrder_in_Tree tree = new PreOrder_in_Tree();
        Scanner sc = new Scanner(System.in);
        while(true){
            int temp=sc.nextInt();
            if(temp<0){
                break;
            }else{
                tree.insert(temp);
            }
        }
        tree.preOrderTraversal();
    }
}
