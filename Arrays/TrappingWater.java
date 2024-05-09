
public class TrappingWater {

    public static int TrappedWater(int height[]) { // TC = O(n)
        int n = height.length;
        // Calcualte leftMax Array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }
        // Calculate RightMax Array
        int RightMax[] = new int[n];
        RightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            RightMax[i] = Math.max(height[i], RightMax[i + 1]);
        }

        int Trapped = 0;
        for (int i = 0; i < n; i++) {
            // WaterLevel = min(LeftMax Boundry , RightMax Boundry)
            int WaterLevel = Math.min(leftMax[i], RightMax[i]);
            // Trapped water = WaterLevel - height
            Trapped += WaterLevel - height[i];
        }
        return Trapped;
    }

    public static void main(String[] args) {

        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(TrappedWater(height));
    }
}
