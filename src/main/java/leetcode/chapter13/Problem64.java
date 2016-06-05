package leetcode.chapter13;

/**
 * Created by Y on 2016-05-24.
 */
public class Problem64 {

    public static void main(String[] args) {
        int sum=new Problem64().minPathSum(new int[][]{{1,2},{1,1}});
    }

    public int minPathSum(int[][] grid) {
        if (grid == null)
            return 0;

        int[][] d = new int[grid.length][grid[0].length];
        d[0][0] = grid[0][0];

        for (int i = 0; i < grid.length; ++i) {
            for (int j = 0; j < grid[i].length; ++j) {
                if (i > 0 && j > 0) {
                    d[i][j] = (d[i - 1][j] < d[i][j - 1] ? d[i - 1][j] : d[i][j - 1]) + grid[i][j];
                } else if (i > 0) {
                    d[i][j] = d[i - 1][j] + grid[i][j];
                } else if (j > 0) {
                    d[i][j] = d[i][j - 1] + grid[i][j];
                }

            }
        }

        return d[grid.length - 1][grid[0].length - 1];
    }

}
