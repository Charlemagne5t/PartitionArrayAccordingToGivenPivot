import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> less = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();
        int eq = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < pivot){
                less.add(nums[i]);
            }else if(nums[i] > pivot){
                greater.add(nums[i]);
            }else eq++;
        }
        int k = 0;
        for(int x : less){
            nums[k++] = x;
        }
        while(eq != 0) {
            eq--;
            nums[k++] = pivot;
        }
        for(int x : greater){
            nums[k++] = x;
        }
        return nums;
    }
}
