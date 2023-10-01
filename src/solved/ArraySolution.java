package solved;

public class ArraySolution {
    public static void main(String[] args) {

        ArraySolution s = new ArraySolution();

        System.out.println(s.removeDuplicates(new int[]{1, 1, 2}));
        System.out.println(s.removeDuplicates(new int[]{1, 1,}));
        System.out.println(s.removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
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
