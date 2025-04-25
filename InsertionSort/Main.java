package InsertionSort;

public class Main {
    public static void main(String[] args) {
        int[] nums = { 14, 9, 15, 12, 6, 8, 13 };
        for (int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
        insertionSort(nums);
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }

    public static int[] insertionSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int j = i;
            while (j > 0 && nums[j - 1] > nums[j]) {
                int temp = nums[j];
                nums[j] = nums[j - 1];
                nums[j - 1] = temp;
                j--;
            }
        }
        return nums;
    }
}