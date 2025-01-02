public class Contains_Duplicate{
    //Best till date.

    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return false;
        }

        mergeSort(nums);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }

    public void mergeSort(int[] arr) { 
        if (arr.length <= 1) {
            return;
        }

        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr, mid, right, 0, arr.length - mid);

        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right);
    }

    private void merge(int[] arr, int[] left, int[] right) { 
        int i = 0, j = 0, k = 0;
        int LL = left.length;
        int RL = right.length;

        while (i < LL && j < RL) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < LL) {
            arr[k++] = left[i++];
        }

        while (j < RL) {
            arr[k++] = right[j++];
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 4, 6, 7, 8, 9, 6, 8};
        Contains_Duplicate bs = new Contains_Duplicate();//Object creation
        boolean zen = bs.containsDuplicate(numbers);
        System.err.println(zen);
    }
}
