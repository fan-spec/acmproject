package leetcode.chapter13;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by Y on 2016-05-22.
 */
public class Problem118 {
    public static void main(String[] args) {

    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list_rslt=new ArrayList<List<Integer>>();
        if(numRows==0)
            return list_rslt;

        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list_rslt.add(list);
        if(numRows==1)
            return list_rslt;

        for(int i=1;i<numRows;++i) {
            list=new ArrayList<Integer>();
            list.add(1);
            for(int j=1;j<i;++j) {
                list.add(list_rslt.get(i-1).get(j)+list_rslt.get(i-1).get(j-1));
            }
            list.add(1);
            list_rslt.add(list);
        }

        return list_rslt;
    }

}
