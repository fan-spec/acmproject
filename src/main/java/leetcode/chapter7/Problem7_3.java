package leetcode.chapter7;

/**
 * Created by yuhaozhe on 2016/5/18.
 */
public class Problem7_3 {

    public static void main(String[] args) {
        System.out.println(new Problem7_3().searchMatrix(new int[][]{{1}}, 1));
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null)
            return false;

        int rowStart = 0, rowEnd = matrix.length - 1;
        while (rowStart <= rowEnd) {
            int mid = (rowStart + rowEnd) / 2;
            int[] midArr = matrix[mid];
            if (target >= midArr[0] && target <= midArr[midArr.length - 1]) {
                int i = 0, j = midArr.length - 1;
                while (i <= j) {
                    int midSub = (i + j) / 2;
                    if (midArr[midSub] == target)
                        return true;

                    if (target < midArr[midSub]) {
                        j = midSub - 1;
                    } else {
                        i = midSub + 1;
                    }
                }

            }

            if (target < midArr[0]) {
                rowEnd = mid - 1;
            } else {
                rowStart = mid + 1;
            }
        }

        return false;
    }
}
