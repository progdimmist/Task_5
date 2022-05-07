package ru.vsu.cs.pavlenkodm;

public class BinaryTree {
    static class Node {
        int value;
        Node left, right;

        Node(int value) {
            this.value = value;
            left = right = null;
        }
    }

    static Node head;

    public Node insert(Node node, int value) {
        if (node == null) {
            return (new Node(value));
        } else {
            if (value <= node.value) {
                node.left = insert(node.left, value);
            } else {
                node.right = insert(node.right, value);
            }
            return node;
        }
    }

    public int minvalue(Node node, int date) {
        Node current = node;
        while ((current.left != null) || (current.right != null)) {
            if (current.left.value >= date) {
                current = current.left;
            } else if ((current.left.right!=null)&&(current.left.right.value>= date)){
                current = current.left.right;
            } else break;
        }
        return (current.value);
    }

    public int maxvalue(Node node, int date) {
        Node current = node;
        while ((current.left != null) || (current.right != null)) {
            if(current.right.value <= date){
                current = current.right;
            }else if ((current.right.right!=null)&&(current.right.left.value<= date)){
                current = current.right.left;
            } else break;

        }
        return (current.value);
    }
}
