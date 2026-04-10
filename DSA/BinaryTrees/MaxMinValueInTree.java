package BinaryTrees;

public class MaxMinValueInTree {
    public static void main(String[] args) {
        //        3
        //      /   \
        //     4     2
        //   /   \ /   \
        // -1    1 6    9
        Node a = new Node(3); // root
        Node b = new Node(4);
        Node c = new Node(2);
        Node d = new Node(-1);
        Node e = new Node(1);
        Node f = new Node(6);
        Node g = new Node(9);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        System.out.println(max(a));
        System.out.println(min(a));
    }
    private static int max(Node root) {
        if (root == null) return Integer.MIN_VALUE;
     return Math.max(root.val, Math.max(max(root.left), max(root.right)));
        
    }
    private static int min(Node root) {
        if (root == null) return Integer.MAX_VALUE;
        return Math.min(root.val, Math.min(min(root.left), min(root.right)));
    }

}
