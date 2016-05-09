package leetcode.chapter3;

import java.util.*;

/**
 * Created by yuhaozhe on 2016/5/9.
 */
public class Problem3_13 {
    public static final String[] input=new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};

    public static void main(String[] args) {
        Problem3_13 p=new Problem3_13();
        long start=System.currentTimeMillis();
        List<List<String>> list_rslt=p.groupAnagrams(input);
        long end=System.currentTimeMillis();
        for (List<String> list : list_rslt) {
            System.out.print("[");
            for (String str : list) {
                System.out.print(str+" ");
            }
            System.out.println("]");
        }
        System.out.println("Time: "+(end-start));

    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list_rslt=new ArrayList<List<String>>();
        Map<String,LinkedList<String>> map=new HashMap<String, LinkedList<String>>();

        String str_sorted="";
        for (String str : strs) {
            char[] array_char=str.toCharArray();
            Arrays.sort(array_char);
            str_sorted=Arrays.toString(array_char);

            if (map.keySet().contains(str_sorted)) {
                LinkedList<String> list=map.get(str_sorted);
                int i;
                for(i=list.size()-1;i>=0;--i){
                    if (str.compareTo(list.get(i)) > 0) {
                        list.add(i+1,str);
                        break;
                    }

                }
                if(i==-1)
                    list.add(0,str);

                map.put(str_sorted,list);
            } else {
                LinkedList<String> list=new LinkedList<String>();
                list.add(str);
                map.put(str_sorted,list);
            }

        }

        for (List<String> list : map.values()) {
            list_rslt.add(list);
        }


        return list_rslt;
    }

}
