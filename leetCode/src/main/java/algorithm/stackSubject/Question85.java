package algorithm.stackSubject;

/**
 * 85. 最大矩形
 * https://leetcode.cn/problems/maximal-rectangle/description/
 * 解题思路：第一遍，相当于求每一层的横切面连续的宽值
 * 第二遍遍历：枚举，求连续深度下的面积
 */
public class Question85 {
    public static int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0){
            return 0;
        }
        int[][] len = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                len[i][j] = matrix[i][j] == '1' ? (j == 0 ? 1 : len[i][j-1] + 1) : 0; //注意输入的是字符，
            }
        }

/*        for (int i = 0; i < len.length; i++) {
            for (int j = 0; j < len[i].length; j++) {
                System.out.print(len[i][j] + ", ");
            }
            System.out.println();
        }*/

        int area = matrix[0][0] == '1' ? 1 : 0;
        for (int j = 0; j < len[0].length; j++){
            for (int i = 0; i < len.length; i++){
                int width = len[i][j];
                for (int k = i; k <len.length ; k++) { //注意这里是从i开始的，求面积，当层的面积也需要计算
                    width = Math.min(width, len[k][j]); //连续宽值的最小值
                    area = Math.max(area, width * (k-i+1)); //枚举记录最大面积
                }
            }
        }
        return area;
    }

    public static void main(String[] args) {
//        char[][] matrix = new char[][]{{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
        char[][] matrix = new char[][]{{'0', '1'}};

        System.out.println(maximalRectangle(matrix));
    }
}
