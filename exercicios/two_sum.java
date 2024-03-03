
public class two_sum {
    public static void main( String args[]){
        int num[]={3,2,4};
        int result[] = twoSum(num, 6);
        for(int i=0; i< result.length;i++){
            System.out.println(result[i]);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] nUse = nums;
        int nResult[]={0,0};
        for(int i=0; i < (nums.length); i++){
            if (nums[i]>target) {
                nUse[i] = 0;
            }
        }

        
        return nUse;
    }
}
