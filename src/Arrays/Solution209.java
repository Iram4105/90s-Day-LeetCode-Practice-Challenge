package Arrays;

public class Solution209 {
    public static int removeDuplicates(int[] nums) {
        int ptr=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[ptr]=nums[i];
                ptr++;
            }
        }
        return ptr;
    }
    public static void main(String[] args){
        int[] nums={1,2,3,3,4,5,5,6};
        int k = removeDuplicates(nums);

        System.out.println("Number of unique elements: " + k);
        System.out.print("Modified array: [");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + (i < k - 1 ? ", " : ""));
        }
        System.out.println("]");
    }
}
