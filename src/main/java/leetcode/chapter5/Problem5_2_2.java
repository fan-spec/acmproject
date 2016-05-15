package leetcode.chapter5;

import java.util.HashMap;

/**
 * Created by Y on 2016-05-13.
 */
public class Problem5_2_2 {
    private HashMap<Integer,Integer> map_in=new HashMap<Integer, Integer>();

    public static void main(String[] args) {

    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder==null||postorder==null)
            return null;

        for(int i=0;i<inorder.length;++i)
            map_in.put(inorder[i],i);

        return helper(inorder,0,inorder.length-1,postorder,0,postorder.length-1);

    }


    public TreeNode helper(int[] inorder,int start_in,int end_in, int[] postorder,int start_post, int end_post) {
        if(start_in>end_in||start_post>end_post)
            return null;

        int val=postorder[end_post];
        TreeNode node=new TreeNode(val);
        int index=map_in.get(val);

        node.left=helper(inorder,start_in,index-1,postorder,start_post,end_post-(end_in-index)-1);
        node.right=helper(inorder,index+1,end_in,postorder,end_post-(end_in-index),end_post-1);

        return node;
    }


}
