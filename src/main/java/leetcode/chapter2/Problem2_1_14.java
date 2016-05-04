package leetcode.chapter2;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by yuhaozhe on 2016/5/4.
 */
public class Problem2_1_14 {
    public static void main(String[] args) {
        Problem2_1_14 problem=new Problem2_1_14();

        System.out.println(problem.isValidSudoku(new char[][]{}));

    }


    public boolean isValidSudoku(char[][] board) {
        Set<Character> set=new HashSet<Character>();
        //Row
        for(int i=0;i<9;++i){
            set.clear();
            for(int j=0;j<9;++j){
                if(board[i][j]=='.')
                    continue;

                if(board[i][j]<'0'||board[i][j]>'9'||set.contains(board[i][j]))
                    return false;

                set.add(board[i][j]);
            }
        }

        //Column
        for(int j=0;j<9;++j){
            set.clear();
            for(int i=0;i<9;++i){
                if(board[i][j]=='.')
                    continue;

                if(board[i][j]<'0'||board[i][j]>'9'||set.contains(board[i][j]))
                    return false;

                set.add(board[i][j]);
            }
        }

        //Sub Grid
        for(int i=0;i<9;i+=3){
            for(int j=0;j<9;j+=3){

                //The start cell of sub grid
                set.clear();
                for(int x=i;x<i+3;++x){
                    for(int y=j;y<j+3;++y){
                        if(board[x][y]=='.')
                            continue;

                        if(board[x][y]<'0'||board[x][y]>'9'||set.contains(board[x][y]))
                            return false;

                        set.add(board[x][y]);
                    }
                }


            }
        }

        return true;
    }

}
