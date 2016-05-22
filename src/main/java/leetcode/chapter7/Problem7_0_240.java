package leetcode.chapter7;

/**
 * Created by yuhaozhe on 2016/5/18.
 */
public class Problem7_0_240 {

    public static void main(String[] args) {

    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int row=0,col=matrix[0].length-1;
        while (row < matrix.length && col >= 0) {
            if(target==matrix[row][col])
                return true;

            if (target > matrix[row][col]) {
                ++row;
            } else {
                --col;
            }
        }

        return false;
    }

}
