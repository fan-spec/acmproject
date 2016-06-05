package leetcode.Random;

/**
 * Created by yuhaozhe on 2016/5/23.
 */
public class Problem338 {

    public static void main(String[] args) {

    }

    // O(n)
    public int[] countBits_v2(int num) {
        if(num<0)
            return null;

        int[] count=new int[num+1];
        for(int i=0;i<=num;++i) count[i]=0;

        for(int i=0;i<=num;++i) {
            count[i]=count[i>>1]+(i&1);
        }

        return count;
    }

    // O(n*k)
    public int[] countBits_v1(int num) {
        if(num<0)
            return null;

        int[] count=new int[num+1];
        for(int i=0;i<=num;++i) count[i]=0;

        for(int i=0;i<=num;++i) {
            int j=i;
            while (j > 0) {
                if((j&1)==1)
                    count[i]++;

                j=j>>1;
            }


        }

        return count;
    }
}
