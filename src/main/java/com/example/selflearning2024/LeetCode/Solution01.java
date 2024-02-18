package com.example.selflearning2024.LeetCode;

/**
 * @Author Miles
 * @Date 2024/2/18 20:46
 * @PackageName:com.example.selflearning2024.LeetCode
 * @ClassName: Solution01
 * @Description: No Pain, No Gain
 * @Version 1.0
 */
public class Solution01 {
    public static void main(String[] args) {
        int[] res = new Solution01().twoSum(new int[]{2, 7, 11, 15}, 9);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);}
    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }
}
