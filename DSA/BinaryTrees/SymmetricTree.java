package BinaryTrees;

public class SymmetricTree {
    public static void main(String[] args) {
        //        3
        //      /   \
        //     4     4
        //   /   \ /   \
        // -1    1 1    -1
        Node a = new Node(3); // root
        Node b = new Node(4);
        Node c = new Node(4);
        Node d = new Node(-1);
        Node e = new Node(1);
        Node f = new Node(1);
        Node g = new Node(-1);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        System.out.println(isSymmetric(a));
    }
    private static boolean isSymmetric(Node root) {
        if (root == null) return true;
        return isMirror(root.left, root.right);
    }
    private static boolean isMirror(Node left, Node right) {
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;
        if (left.val != right.val) return false;
        return isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }
}
