package leetcode.chapter5;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yuhaozhe on 2016/5/16.
 */
public class Problem5_3_2 {

    public static void main(String[] args) {

    }

    public List<TreeNode> generateTrees(int n) {
        if(n==0)
            return new ArrayList<>();

        return helper(1,n);
    }

    public List<TreeNode> helper(int left,int right) {
        List<TreeNode> list_rslt=new ArrayList<>();

        if (left > right) {
            list_rslt.add(null);
            return list_rslt;
        }

        for(int i=left;i<=right;++i) {

            List<TreeNode> list_left=helper(left,i-1);
            List<TreeNode> list_right=helper(i+1,right);
            TreeNode root;
            for(int m=0;m<list_left.size();++m) {
                for(int n=0;n<list_right.size();++n) {
                    root=new TreeNode(i);
                    root.left=list_left.get(m);
                    root.right=list_right.get(n);

                    list_rslt.add(root);
                }
            }

        }

        return list_rslt;
    }

}
