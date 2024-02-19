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

        int m = matrix.length;
        int n = matrix[0].length;

        // 步骤1: 标记需要置零的行和列
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = col[j] = true;
                }
            }
        }

        // 步骤2: 根据标记置零对应的行和列
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (row[i] || col[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}

