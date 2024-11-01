package Grind75;

public class InvertBinaryTree {
    public static void main(String[] args){

    }


// Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    public static TreeNode invertTree(TreeNode root) {
        if(root == null){
            return root;
        }
        invertNode(root);
        return root;
    }

    public static void invertNode(TreeNode node){
        if(node.right == null && node.left == null){
            return;
        }

        TreeNode tmp = node.left;
        node.left = node.right;
        node.right = tmp;

        invertNode(node.left);
        invertNode(node.right);
    }
}
