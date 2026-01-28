import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // array size
        System.out.println("Enter the number of integers");
        int n = sc.nextInt();
        int[] nums = new int[n];

        // array elements
        System.out.println("Enter the integer values");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // target
        System.out.println("enter the target value");
        int target = sc.nextInt();

        boolean result = twoSum(nums, target);
        System.out.println(result);
    }

    public static boolean twoSum(int[] nums, int target) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("index "+i+" + "+" index "+j+"="+target);
                    return true;
                }

            }

        }

        return false;
    }
}
