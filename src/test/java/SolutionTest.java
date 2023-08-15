import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void pivotArrayTest1() {
        int[] nums = {9, 12, 5, 10, 14, 3, 10};
        int pivot = 10;
        int[] expected = {9, 5, 3, 10, 10, 12, 14};
        new Solution().pivotArray(nums, pivot);

        Assert.assertArrayEquals(expected, nums);
    }

    @Test
    public void pivotArrayTest2() {
        int[] nums = {-3, 4, 3, 2};
        int pivot = 2;
        int[] expected = {-3, 2, 4, 3};
        new Solution().pivotArray(nums, pivot);

        Assert.assertArrayEquals(expected, nums);
    }

}
