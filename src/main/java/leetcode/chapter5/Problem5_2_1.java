package leetcode.chapter5;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Y on 2016-05-12.
 */
public class Problem5_2_1 {
    private Map<Integer,Integer> map=new HashMap<Integer, Integer>();

    public static void main(String[] args) {

    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder==null||inorder==null)
            return null;

        for(int i=0;i<inorder.length;++i) {
            map.put(inorder[i],i);
        }

        return helper(preorder,0,preorder.length-1,inorder,0,inorder.length-1);

    }

    public TreeNode helper(int[] preorder,int start_pre,int end_pre, int[] inorder,int start_in,int end_in) {
        if(start_in>end_in||start_pre>end_pre)
            return null;

        int val=preorder[start_pre];
        int root=map.get(val);

        TreeNode node=new TreeNode(val);
        node.left=helper(preorder,start_pre+1,root-start_in+start_pre,inorder,start_in,root-1);
        node.right=helper(preorder,root-start_in+start_pre+1,end_pre,inorder,root+1,end_in);

        return node;
    }

}
