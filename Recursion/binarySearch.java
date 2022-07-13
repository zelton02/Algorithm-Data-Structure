public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 5;
        int result = binarySearch(arr, 0, arr.length-1, target);
        System.out.println(result);
    }

    private static int binarySearch(int[] arr, int left, int right, int target) {
        if (left > right)
            return -1;

        int mid = (right+left)/2;

        if (arr[mid]==target)
            return mid;

        if (arr[mid] > target)
            return binarySearch(arr, mid+1, right, target);
        else
            return binarySearch(arr, left, mid-1, target);
    }
}
