public class mergeSort {

    public static void main(String[] args) {
        
    }

    public static void mergeSort(int[] arr, int start, int end) {
        if (start < end){
            int mid = ((start+end)/2);
            mergeSort(arr, start, mid);
            mergeSort(arr, mid+1, end);
            merge(arr, start, mid, end);
        }
    }

    public static void merge(int[] arr, int start, int mid, int end) {
        // build temp arr to avoid modifying the original contents
        int[] temp = new int[end - start + 1];

        int i = start, j = mid+1, k = 0;

        // while both sub-array have values, then try and merge them in sorted order
        while (i <= mid && j < end) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Add the rest of the values from the left sub-array into the result
        while (i <= mid) {
            temp[k] = arr[i];
            k++;
            i++;
        }

        
    }
}