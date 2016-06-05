package selfstudy.wap;

import java.util.*;

/**
 * Created by Y on 2016-05-25.
 */
public class Exam1 {
    private static int minPixel=110;
    private static int minPixel_theoretical;

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N,M,K;

        N=in.nextInt();
        M=in.nextInt();
        K=in.nextInt();
        String line=in.nextLine();

        ArrayList<LinkedList<Integer>> list_chars=new ArrayList<LinkedList<Integer>>();
        ArrayList<StringBuilder> pre=new ArrayList<StringBuilder>();
        for(int i=0;i<K;++i) {
            line=in.nextLine();

            LinkedList<Integer> list_temp=new LinkedList<Integer>();
            int count=0;
            for(int j=0;j<N;++j) {
                line=in.nextLine();
                for(int k=0;k<M;++k) {
                    list_temp.add(line.charAt(k)-'0');
                }

            }

            list_chars.add(list_temp);
            pre.add(new StringBuilder(""));
        }


        minPixel_theoretical=(int)Math.ceil(Math.log(K)/Math.log(2));
        getMinPixel(N,M,K,list_chars,0,pre);
        System.out.println(minPixel);
    }

    //The function get the min number of pixel
    public static void getMinPixel(int N,int M,int K,ArrayList<LinkedList<Integer>> list_chars,int count,ArrayList<StringBuilder> pre) {
        if (count == N * M) {
            if(minPixel>(N*M))
                minPixel=N*M;

            return;
        }

        if(minPixel==minPixel_theoretical)
            return;

        ++count;
        int size=list_chars.get(0).size();
        for(int i=0;i<size;++i) {
            Set<String> factorSet=new HashSet<String>();
            ArrayList<LinkedList<Integer>> list_chars_temp=new ArrayList<LinkedList<Integer>>();
            ArrayList<StringBuilder> pre_temp=new ArrayList<StringBuilder>();
            int j=0;
            StringBuilder sb;
            LinkedList<Integer> list_temp;

            for (LinkedList<Integer> array : list_chars) {
                list_temp=new LinkedList<Integer>(array);


                sb=new StringBuilder(pre.get(j++).toString());
                sb.append(list_temp.get(i));
                factorSet.add(sb.toString());
                pre_temp.add(sb);

                list_temp.remove(i);
                list_chars_temp.add(list_temp);
            }

            if (factorSet.size() == list_chars.size()) {
                minPixel=count<minPixel?count:minPixel;
                return;
            }

            if(count>minPixel)
                return;
            if(Math.ceil((Math.log(factorSet.size())/Math.log(2)))>(size-1))
                return;


            getMinPixel(N,M,K,list_chars_temp,count,pre_temp);
        }

    }
}
