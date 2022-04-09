package array;

/**
 * 给你一个正整数 n ，生成一个包含 1 到 n2 所有元素，且元素按顺时针顺序螺旋排列的 n x n 正方形矩阵 matrix 。
 */
public class martix59 {

    /*
     * @lc app=leetcode.cn id=59 lang=java
     *
     * [59] 螺旋矩阵 II
     */

    // @lc code=start

        public int[][] generateMatrix(int n) {
            int[][] maxtrix = new int[n][n];
            int left = 0;
            int right = n-1;
            int top =0;
            int bottom = n-1;
            int k= 1;

            while(top<=bottom&&left<=right){

                for(int column = left ;column <=right;column++){
                    maxtrix[top][column] = k++;
                }

                for(int row = top+1;row<=bottom;row++){
                    maxtrix[row][right] = k++;
                }
                if(top<bottom && left<right){
                    for(int column = right-1 ;column >left ;column--){
                        maxtrix[bottom][column] = k++;
                    }
                    for(int row=bottom;row>top;row--){
                        maxtrix[row][left] = k++;
                    }
                }

                left++;
                right--;
                top++;
                bottom--;
            }


            return maxtrix;
        }

}
