package leetcode.Tag_DynamicProgramming;

/**
 * Created by Y on 2016-06-02.
 */
public class Problem121 {

    public static void main(String[] args) {

    }

    public int maxProfit(int[] prices) {
        if(prices.length<=1)
            return 0;

        int d=0,min=prices[0],profile=0;
        for(int i=1;i<prices.length;++i) {
            profile=prices[i]-min;

            d=profile>d?profile:d;
            min=profile>0?min:prices[i];
        }

        return d;
    }
}
