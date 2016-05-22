package selfstudy.realexam;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Y on 2016-05-22.
 */
public class Exam1_Game {
    private static int n;
    private static int m;
    private static long maxScore;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        int[][] grid = new int[n][m];


        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                grid[i][j] = in.nextInt();
            }
        }

        maxScore = 0L;
        for(int i=0;i<n;++i) {
            helper(grid,i,0,0L);
        }

        System.out.println("MaxScore is: "+maxScore);
    }

    public static void helper(int[][] grid, int x, int y, long score) {

        //get the terminal
        if (y == m) {
            if (score > maxScore)
                maxScore = score;

            return;
        }
        //get the top or bottom of a column
        if (x < 0) {
            score = 0;
            x = (x + n) % n;
        } else if (x == n) {
            score = 0;
            x = x % n;
        }
        //get the blocked cell but not terminal
        if (grid[x][y] == -1) {
            return;
        }


        /**********************************/
        long point = grid[x][y];
        int[][] grid_new = new int[n][m];
        for (int i = 0; i < n; ++i)
            System.arraycopy(grid[i], 0, grid_new[i], 0, grid[i].length);

        grid_new[x][y] = -1;

        helper(grid_new, x - 1, y, score + point); //up
        helper(grid_new, x + 1, y, score + point); //down
        helper(grid_new, x, y + 1, score + point); //right

    }


}

