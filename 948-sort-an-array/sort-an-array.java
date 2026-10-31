class Solution {
    public int[] sortArray(int[] nums) {
        int min = nums[0];
        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        int[] count = new int[max - min + 1];

        for (int i = 0; i < nums.length; i++) {
            count[nums[i] - min]++;
        }

        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                nums[index] = i + min;
                index++;
                count[i]--;
            }
        }

        return nums;
    }
}