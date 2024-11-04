package Grind75;

public class BalancedBinaryTree {
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


    public boolean isBalanced(TreeNode root) {
        // checkHeight의 리턴값이 -1이 아니면 true(균형), -1이면 false(불균형)
        return checkHeight(root) != -1;
    }

    public int checkHeight(TreeNode node){
        if(node == null){
            return 0;
        }

        // 왼쪽 트리가 불균형 상태면(리턴값 -1) -1 리턴
        int leftHeight = checkHeight(node.left);
        if(leftHeight == -1){
            return -1;
        }

        // 오른쪽 트리도 마찬가지
        int rightHeight = checkHeight(node.right);
        if(rightHeight == -1){
            return -1;
        }

        // 왼쪽 트리와 오른쪽 트리의 높이가 1이상 차이나면 불균형이므로 -1 리턴
        if(Math.abs(leftHeight - rightHeight) > 1){
            return -1;
        }

        // 불균형이 아니면 왼쪽 트리와 오른쪽 트리의 높이중 큰것에 +1하여 현재 노드의 높이 리턴
        return Math.max(leftHeight, rightHeight)+1;
    }


}
