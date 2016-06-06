package leetcode.Random;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Y on 2016-06-05.
 */
public class Problem119 {

    public static void main(String[] args) {

    }

    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        if(rowIndex==0)
            return list;

        list.add(1);
        if(rowIndex==1)
            return list;


        ArrayList<Integer> list_temp=new ArrayList<>();
        for(int i=2;i<=rowIndex;++i) {
            list_temp.add(1);
            for(int j=1;j<list.size();++j) {
                list_temp.add(list.get(j-1)+list.get(j));
            }
            list_temp.add(1);

            list=list_temp;
            list_temp=new ArrayList<>();
        }

        return list;
    }
}
