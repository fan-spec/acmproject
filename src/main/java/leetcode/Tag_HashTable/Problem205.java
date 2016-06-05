package leetcode.Tag_HashTable;

import java.util.HashMap;

/**
 * Created by Y on 2016-06-02.
 */
public class Problem205 {

    public static void main(String[] args) {


    }

    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Integer> mapS=new HashMap<>();
        HashMap<Character,Integer> mapT=new HashMap<>();


        for(Integer i=0;i<s.length();++i) {
            char chS=s.charAt(i);
            char chT=t.charAt(i);

            if(mapS.get(chS)!=mapT.get(chT))
                return false;

            mapS.put(chS,i);
            mapT.put(chT,i);
        }

        return true;
    }


    public boolean isIsomorphic_v2(String s, String t) {
        int[] m1=new int[256];
        int[] m2=new int[256];
        for(int i=0;i<256;++i){
            m1[i]=m2[i]=0;
        }

        int count = 1;
        for(int i=0; i<s.length(); i++) {
            if(m1[s.charAt(i)]!=m2[t.charAt(i)]) return false;
            if(m1[s.charAt(i)]==0) {
                m1[s.charAt(i)]=count;
                m2[t.charAt(i)]=count;
                count++;
            }
        }
        return true;
    }
}
