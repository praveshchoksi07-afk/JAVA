public class Solution {
    public void rotate(int[] nums, int k) {

        int n = nums.length;
        k = k % n;   // Handles cases where k > n

        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }
    }
} 
int main() {
    int[] nums = {1, 2, 3, 4, 5, 6, 7};
    int k = 3;

    Solution sol = new Solution();
    sol.rotate(nums, k);

    System.out.print("Array after rotation: ");
    for (int num : nums) {
        System.out.print(num + " ");
    }
}
