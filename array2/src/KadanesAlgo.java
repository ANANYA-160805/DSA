public class KadanesAlgo {
    public static void main(String[] args) {
        int[] nums={1,3,5,-3,6,-2,8};
        System.out.print("max subarray sum:");
        System.out.println(maxSubArray(nums));
    }
    private static int maxSubArray(int[] nums) {

//         Brute force Approach
//        ->Time complexity - o(n^2)

//        int maxSum=Integer.MIN_VALUE;
//        for(int st=0;st<nums.length;st++){
//            int sum =0;
//        for(int end=st;end<nums.length;end++){
//            sum+=nums[end];
//            maxSum=Math.max(sum,maxSum);
//            }
//        }
//        return maxSum;

//        Kadane's algorithm
        int maxSum=Integer.MIN_VALUE;
        int curSum=0;

        for(int val : nums){
            curSum+=val;
            maxSum=Math.max(curSum,maxSum);
            if(curSum<0){
                curSum=0;
            }
        }
        return maxSum;
    }

}
