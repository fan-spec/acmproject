package leetcode.chapter13;

/**
 * Created by Y on 2016-05-25.
 */
public class Problem63 {

    public static void main(String[] args) {

    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid==null||obstacleGrid[0][0]==1)
            return 0;

        int M=obstacleGrid.length;
        int N=obstacleGrid[0].length;

        obstacleGrid[0][0]=obstacleGrid[0][0]^1;
        for(int i=1;i<N;++i) {     //row1
            obstacleGrid[0][i]=(obstacleGrid[0][i]==1)?0:obstacleGrid[0][i-1];
        }
        for(int i=1;i<M;++i) {     //column1
            obstacleGrid[i][0]=(obstacleGrid[i][0]==1)?0:obstacleGrid[i-1][0];
        }

        for(int i=1;i<M;++i) {
            for(int j=1;j<N;++j) {
                obstacleGrid[i][j]=(obstacleGrid[i][j]==1)?0:(obstacleGrid[i-1][j]+obstacleGrid[i][j-1]);
            }
        }


        return obstacleGrid[M-1][N-1];
    }


}
