package cn.telami.leetcode.xiaohao;

/**
 * @author zhuhc
 * @date 2020/4/3 13:47
 */
public class XiaoHao0110 {

    /**
     * https://mp.weixin.qq.com/s/2lChUEG5HGkN3sTdKDZ7Cw
     */
    public static void main(String[] args) {
        int[] array = new int[]{3, 2, 2, 3, 4, 5, 6, 3};
        int val = 3;
        int repeatCount = getRepeatCount(array, val);
        System.out.println(repeatCount);
    }

    public static int getRepeatCount(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (val == nums[j]) {
                nums[i] = nums[j];
            }else {
                i++;
            }
        }
        return i;
    }
}
