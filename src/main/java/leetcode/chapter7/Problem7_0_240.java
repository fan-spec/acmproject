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

        if (col == 0) {
            int i=0,j=row;
            while (i <= j) {
                int mid=(i+j)/2;
                if(matrix[mid][0]==target)
                    return true;

                if (target < matrix[mid][0]) {
                    j = mid - 1;
                } else {
                    i=mid+1;
                }
            }
        }

        if (row == (matrix.length - 1)) {
            int i=0,j=row;
            while (i <= j) {
                int mid=(i+j)/2;
                if(matrix[row][mid]==target)
                    return true;

                if (target < matrix[row][mid]) {
                    j = mid - 1;
                } else {
                    i=mid+1;
                }
            }
        }

        return false;
    }

}
