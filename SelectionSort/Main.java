public class Main {
    public static void main(String[] args) {
        int[] arr = { 7, 4, 1, 5, 3 };
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        selectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static int[] selectionSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int mini = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[mini]) {
                    mini = j;
                }
            }
            int temp = nums[mini];
            nums[mini] = nums[i];
            nums[i] = temp;
        }
        return nums;
    }
}
