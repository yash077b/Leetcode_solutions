/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> values = new ArrayList<>();
        for (ListNode curr = head; curr != null; curr = curr.next) {
            values.add(curr.val);
        }

        int n = values.size();
        int[] ans= new int[n];
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            int currentVal = values.get(i);
            while (!stack.isEmpty() && currentVal > values.get(stack.peek())) {
                ans[stack.pop()] = currentVal;
            }
            stack.push(i);
        }

        return ans;
    }
}