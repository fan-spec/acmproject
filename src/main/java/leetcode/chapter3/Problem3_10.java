package leetcode.chapter3;

import java.util.ArrayList;

/**
 * Created by Y on 2016-05-07.
 */
public class Problem3_10 {

    public static void main(String[] args) {

    }

    public String intToRoman(int num) {
        ArrayList<Character> listChar=new ArrayList<Character>();
        int n=0,count=1;
        while(num>0){
            n=num%10;

            switch (count){

                case 1:{	//个位数
                    if(n==4){
                        listChar.add('V');
                        listChar.add('I');
                    }else if(n==9){
                        listChar.add('X');
                        listChar.add('I');
                    }else if(n==5){
                        listChar.add('V');
                    }else if(n>5){
                        for(int i=0;i<n-5;++i){
                            listChar.add('I');
                        }
                        listChar.add('V');
                    }else{
                        for(int i=0;i<n;++i){
                            listChar.add('I');
                        }
                    }

                    break;
                }
                case 2:{	//十位数
                    if(n==4){
                        listChar.add('L');
                        listChar.add('X');
                    }else if(n==9){
                        listChar.add('C');
                        listChar.add('X');
                    }else if(n==5){
                        listChar.add('L');
                    }else if(n>5){
                        for(int i=0;i<n-5;++i){
                            listChar.add('X');
                        }
                        listChar.add('L');
                    }else{
                        for(int i=0;i<n;++i){
                            listChar.add('X');
                        }
                    }


                    break;
                }
                case 3:{	//百位数
                    if(n==4){
                        listChar.add('D');
                        listChar.add('C');
                    }else if(n==9){
                        listChar.add('M');
                        listChar.add('C');
                    }else if(n==5){
                        listChar.add('D');
                    }else if(n>5){
                        for(int i=0;i<n-5;++i){
                            listChar.add('C');
                        }
                        listChar.add('D');
                    }else{
                        for(int i=0;i<n;++i){
                            listChar.add('C');
                        }
                    }

                    break;
                }
                case 4:{	//千位数
                    for(int i=0;i<n;++i){
                        listChar.add('M');
                    }

                    break;
                }

            }

            num/=10;
            ++count;
        }

        StringBuilder sb=new StringBuilder();
        for(int i=listChar.size()-1;i>=0;--i){
            sb.append(listChar.get(i));
        }

        return sb.toString();
    }

}
