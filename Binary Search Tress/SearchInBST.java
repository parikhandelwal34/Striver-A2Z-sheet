import java.util.*;

class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null){
            return null;
        }
        if(root.val == val){
            return root;
        }else if(root.val < val){
            return searchBST(root.right,val);
        }else{
            return searchBST(root.left , val);
        }
    }
}

//Problem Link : https://leetcode.com/problems/search-in-a-binary-search-tree/
// TC : O(1) -> best case , O(logn) -> Average Case , O(n) -> worst case
// SC : O(logn) , O(n)