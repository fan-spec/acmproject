package leetcode.Tag_DynamicProgramming;

/**
 * Created by Y on 2016-06-02.
 */
public class Problem304 {

    public static void main(String[] args) {
        int[][] matrix=new int[][]{{3,0,1,4,2},{5,6,3,2,1},{1,2,0,1,5},{4,1,0,1,7},{1,0,3,0,5}};


        NumMatrix numMatrix = new NumMatrix(matrix);
        System.out.println(numMatrix.sumRegion(2, 1, 4, 3)+" ");
    }


}


class NumMatrix {
    int[][] d;

    public NumMatrix(int[][] matrix) {
        if(matrix==null||matrix.length==0)
            return;

        int n=matrix.length;
        int m=matrix[0].length;


        d=matrix;
        for(int i=1;i<m;++i) d[0][i]=d[0][i-1]+matrix[0][i];
        for(int i=1;i<n;++i) d[i][0]=d[i-1][0]+matrix[i][0];

        for(int i=1;i<n;++i) {
            for(int j=1;j<m;++j) {
                d[i][j]=d[i-1][j]+matrix[i][j]+d[i][j-1]-d[i-1][j-1];
            }
        }

        return;
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        if(d==null)
            return 0;

        if(col1==0&&row1==0)
            return d[row2][col2];

        if(col1==0)
            return d[row2][col2]-d[row1-1][col2];

        if(row1==0)
            return d[row2][col2]-d[row2][col1-1];


        return d[row2][col2]-d[row1-1][col2]-d[row2][col1-1]+d[row1-1][col1-1];
    }
}
