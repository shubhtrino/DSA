package Array.medium;

public class MaxArea {

    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            maxArea = Math.max(maxArea, Math.min(height[left], height[right])
                    * (right - left));
            if (height[left] < height[right])
                left++;
            else
                right--;
        }

        return maxArea;
    }

    public static void main(String[] args) {
        MaxArea area = new MaxArea();
        area.maxArea(new int[] {1,8,6,2,5,4,8,3,7});
    }
}
