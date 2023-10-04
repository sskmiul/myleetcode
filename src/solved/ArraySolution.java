package solved;

public class ArraySolution {
    public static void main(String[] args) {

        ArraySolution s = new ArraySolution();

        System.out.println(s.maxProfit(new int[]{1, 1, 2}));
        System.out.println(s.maxProfit(new int[]{7,1,5,3,6,4}));
        System.out.println(s.maxProfit(new int[]{1,2,3,4,5}));
    }

    /**
     * https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/564/
     */
    public int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            int rise = prices[i] - prices[i - 1];
            if (rise > 0) {
                max += rise;
            }

        }
        return max;
    }


    /**
     * https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/727/
     */
    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        int left = 0;
        int right = 1;
        while (right <= length - 1) {
            boolean same = nums[left] == nums[right];
            //not the same
            if (!same) {
                if (left + 1 == right) {
                    left++;
                    right++;
                } else {
                    left++;
                    nums[left] = nums[right];
                    right++;
                }
            } else {
                //same
                right++;
            }
        }
        return left + 1;

    }
}
