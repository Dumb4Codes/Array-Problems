public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {3, 0, 1, 4, 5, 6, 7};
        int missingNumber = findMissingNumber(nums);
        System.out.println("The missing number is: " + missingNumber);
    }

    public static int findMissingNumber(int[] nums) {
        int n = nums.length + 1; // Expected length of the array (including the missing number)
        int expectedSum = (n * (n - 1)) / 2; 

        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }
}
