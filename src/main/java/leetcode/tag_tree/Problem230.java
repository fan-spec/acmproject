package leetcode.Tag_Tree;

/**
 * Created by Y on 2016-06-01.
 */
public class Problem230 {
    private int count=0;
    private int kthNum=0;
    private boolean flag=false;
    public static void main(String[] args) {

    }

    public int kthSmallest(TreeNode root, int k) {
        helper(root,k);

        return kthNum;
    }

    public void helper(TreeNode root,int k) {
        if(root==null||flag)
            return;

        if(root.left!=null) helper(root.left,k);
        ++count;
        if(count==k){
            kthNum=root.val;
            flag=true;
            return;
        }

        if(root.right!=null) helper(root.right,k);

    }

}
