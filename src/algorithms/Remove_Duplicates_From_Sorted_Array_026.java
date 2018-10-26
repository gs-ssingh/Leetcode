package algorithms;

public class Remove_Duplicates_From_Sorted_Array_026 {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 0; j < nums.length; ) {
            int val = nums[j];
            while (j < nums.length && nums[j] == val) j++;
            nums[i++] = val;
        }

        return i;
    }

}
