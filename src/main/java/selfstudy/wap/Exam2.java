package selfstudy.wap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Y on 2016-05-26.
 */
public class Exam2 {
    private static final int TREE_LEVEL=41;
    private static int nodeNum=0;

    public static void main(String[] args) throws IOException {

        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(reader.readLine());
        String line=reader.readLine();
        while (line.trim().length() == 0) {
            line=reader.readLine();
        }
        String[] strs=line.split(" ");

        long[] nums=new long[N];
        for(int i=0;i<N;++i) {
            nums[i]=Long.parseLong(strs[i]);
        }
        reader.close();


        long maxXor=0L;
        long[] pre=new long[nums.length+1];
        long[] suf=new long[nums.length+2];

        int len=nums.length;
        pre[0]=0L;
        suf[0]=0L;
        suf[len+1]=0L;
        for(int i=0;i<len;++i) {
            pre[i+1]=nums[i]^pre[i];
            suf[len-i]=nums[len-1-i]^suf[len-i+1];

            maxXor=suf[len-i]>maxXor?suf[len-i]:maxXor;
        }

        TreeNode[] root=new TreeNode[TREE_LEVEL*100000];     //the value of root node is -1
        root[0]=new TreeNode();

        for(int i=1;i<=len;++i) {
            addNode(root,pre[i]);
            maxXor=find(root,suf[i+1],maxXor);
        }


        System.out.println(""+maxXor);
    }


    public static void addNode(TreeNode[] root,long val) {

        int p;
        int cur=0;
        for(int i=TREE_LEVEL;i>=0;--i) {
            p=((1L<<i)&val)>0?1:0;

            if (root[cur].child[p] == -1) {
                TreeNode node = new TreeNode();
                root[++nodeNum]=node;
                root[cur].child[p]=nodeNum;
            }
            cur=root[cur].child[p];
        }

    }


    public static long find(TreeNode[] root,long val,long maxXor) {
        long curXor=0L;
        int p;
        int cur=0;
        for(int i=TREE_LEVEL;i>=0;--i) {
            p=((1L<<i)&val)>0?0:1;   //this line let p be the !value of the ith bit of val

            if (root[cur].child[p] != -1) {
                curXor += (1L << i);
                cur = root[cur].child[p];
            } else {
                cur=root[cur].child[p^1];
            }

        }

        return curXor>maxXor?curXor:maxXor;
    }

}

//Trie node
class TreeNode{
    int[] child;

    TreeNode() {
        child=new int[]{-1,-1};
    }
}