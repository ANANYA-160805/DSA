public class ContainerWithMaxWater {
    public static void main(String[] args) {
        int[] height ={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }

    private static int maxArea(int[] height) {

//        Brute force approach

//        int maxWater = Integer.MIN_VALUE;
//        for (int i = 1; i < height.length; i++) {
//            for(int j= i+1; j< height.length; j++) {
//                int width = j-i;
//                int length= Math.min(height[i],height[j]);
//                int area = width*length;
//                maxWater = Math.max(maxWater, area);
//
//            }
//        }
//        return maxWater;

//        Optimal approach - Two pointers

        int maxWater = Integer.MIN_VALUE;
        int i = 0;
        int j = height.length - 1;
        while (i < j) {
            int area = Math.min(height[i], height[j]) * (j - i);
            maxWater = Math.max(maxWater, area);

            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return maxWater;
    }
}
