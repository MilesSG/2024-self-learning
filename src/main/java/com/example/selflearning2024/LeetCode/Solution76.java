package com.example.selflearning2024.LeetCode;

/**
 * @Author Miles
 * @Date 2024/2/18 21:30
 * @PackageName:com.example.selflearning2024.LeetCode
 * @ClassName: Solution76
 * @Description: No Pain, No Gain
 * @Version 1.0
 */
public class Solution76 {

    public void setZeroes(int[][] matrix) {

        // 步骤1: 标记需要置零的行和列
        boolean[] row = new boolean[matrix.length];
        boolean[] col = new boolean[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = col[j] = true;
                }
            }
        }

        // 步骤2: 根据标记置零对应的行和列
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (row[i] || col[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}

