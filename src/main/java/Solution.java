import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        Queue<Integer> left = new LinkedList<>();
        int countPivots = 0;
        Queue<Integer> right = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < pivot) {
                left.add(nums[i]);
            } else if (nums[i] == pivot) {
                countPivots++;
            } else {
                right.add(nums[i]);
            }
        }
        int i = 0;
        while (!left.isEmpty()) {
            nums[i] = left.poll();
            i++;
        }
        while (countPivots != 0) {
            nums[i] = pivot;
            countPivots--;
            i++;
        }
        while (!right.isEmpty()) {
            nums[i] = right.poll();
            i++;
        }

        return nums;
    }
}
