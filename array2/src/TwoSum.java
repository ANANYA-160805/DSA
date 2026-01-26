public class TwoSum {
    public static void main(String[] args) {
        System.out.println("two sum");
        int [] nums = {1,2,3,4,5};
        int target = 6;
        boolean result = twoSum(nums, target);
        System.out.println(result);
    }
    public static boolean twoSum(int[]nums, int target){
        int n =nums.length;
        for (int i = 0; i <n ; i++) {
            for (int j = i+1; j <n ; j++) {
                if (nums[i]+nums[j]==target){
                    System.out.println( i +" index ["+nums[i]+"] + "+ j +" index ["+nums[j]+"] sum is equal to target which is "+target);
                    return true;
                }
            }
        }
        return  false;
    }
}
