import java.util.Arrays;

class Solution {

    public boolean canPartitionKSubsets(int[] nums, int k) {

        int sum = 0;

        for (int num : nums)
            sum += num;

        if (sum % k != 0)
            return false;

        Arrays.sort(nums);

        boolean[] used = new boolean[nums.length];

        return backtrack(nums, used, k, 0,
                sum / k, nums.length - 1);
    }

    private boolean backtrack(int[] nums,
                              boolean[] used,
                              int k,
                              int currentSum,
                              int target,
                              int index) {

        if (k == 1)
            return true;

        if (currentSum == target)
            return backtrack(nums, used, k - 1,
                    0, target, nums.length - 1);

        for (int i = index; i >= 0; i--) {

            if (used[i] || currentSum + nums[i] > target)
                continue;

            used[i] = true;

            if (backtrack(nums, used, k,
                    currentSum + nums[i],
                    target, i - 1))
                return true;

            used[i] = false;
        }

        return false;
    }
}