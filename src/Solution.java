import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();


        String res = Arrays.toString(solution.twoSum(new int[]{3, 2, 4}, 6));


        System.out.println(res);
    }

    public int[] twoSum(int[] nums, int target) {
        int[] copy = Arrays.copyOf(nums, nums.length);
        Arrays.sort(nums);

        int leftIdx = 0;
        int rIdx = nums.length - 1;

        do {
            int left = nums[leftIdx];
            int right = nums[rIdx];
            int sum = left + right;
            if (sum > target) {
                rIdx--;
            } else if (sum < target) {
                leftIdx++;
            } else {
                //find idx
                int leftOriginIdx = -1;
                int rOIdx = -1;
                for (int i = 0; i < copy.length; i++) {
                    if (leftOriginIdx != -1 && rOIdx != -1) {
                        break;
                    }
                    if (leftOriginIdx == -1 && copy[i] == left) {
                        leftOriginIdx = i;
                        continue;
                    }
                    if (rOIdx == -1 && copy[i] == right) {
                        rOIdx = i;
                    }
                }
                return new int[]{leftOriginIdx, rOIdx};
            }
        } while (rIdx != leftIdx);
        return new int[]{};
    }


}
