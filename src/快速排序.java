import java.util.Arrays;

public class 快速排序 {
    public static void main(String[] args) {
        int nums[]={5,1,1,2,0,0};
        int temp[]=sortArray(nums);
    }
    public static int[] sortArray(int[] nums) {
        recurse(0, nums.length-1, nums);
        System.out.println(Arrays.toString(nums));
        return nums;
    }
    public static void recurse(int left,int right,int[] nums){
        if(right<=left)
            return;
        int L=left,R=right;
        int pivot=nums[left];
        while(right>left){
            while(right>left && nums[right]>=pivot){
                right--;
            }
            if(right>left && nums[right]<pivot){
                nums[left++]=nums[right];
            }
            while(right>left && nums[left]<=pivot){
                left++;
            }
            if(right>left && nums[left]>pivot){
                nums[right--]=nums[left];
            }
        }
        nums[left]=pivot;
        recurse(L,left-1,nums);
        recurse(left+1,R,nums);
    }
}
