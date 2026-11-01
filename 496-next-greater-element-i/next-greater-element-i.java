class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            int nextGreater = -1;

            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    for (int k = j + 1; k < nums2.length; k++) {
                        if (nums2[k] > nums1[i]) {
                            nextGreater = nums2[k];
                            break;
                        }
                    }
                    break;
                }
            }

            ans[i] = nextGreater;
        }

        return ans;
    }
}