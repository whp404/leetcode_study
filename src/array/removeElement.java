package array;

/**
 * 27. 移除元素
 */
public class removeElement {

    /**
     * 双指针
     * @param nums
     * @param val
     * @return
     */
    public int removeElement(int[] nums, int val) {
        int slow  = 0;
        int fast = 0 ;

        for (fast = 0; fast  < nums.length; fast++) {
            if(nums[fast]!=val){
                nums[slow++] = nums[fast];
            }
        }
        return slow;
    }
}
