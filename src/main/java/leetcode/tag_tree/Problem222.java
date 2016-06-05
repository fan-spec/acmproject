package leetcode.Tag_Tree;

/**
 * Created by Y on 2016-06-01.
 */
public class Problem222 {

    public static void main(String[] args) {

    }

    public int countNodes(TreeNode root) {
        if(root==null)
            return 0;

        int leftDepth=0,rightDepth=0;
        TreeNode index=root;
        while (index != null) {
            ++leftDepth;
            index=index.left;
        }
        index=root;
        while (index != null) {
            ++rightDepth;
            index=index.right;
        }

        if(leftDepth==rightDepth){
            return (1<<leftDepth)-1;
        } else{
            return countNodes(root.left)+countNodes(root.right)+1;
        }

    }

}
