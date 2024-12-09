package searchsort;

public class SelectionSort {
    /**
     * Sort the array arr using selection sort algorithm.
     */
    public static void sort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++)
        {
            int minIndex = findMin(arr, i);
            swap(arr, i, minIndex);
        }
    }
    private int findMin(int[] arr, int startIndex)
    {
        int minIndex = startIndex;
        for(int i = minIndex + 1; i < arr.length; i++)
        {
            if(arr[i] < arr[minIndex])
            {
                minIndex = i;
            }
        }
        return minIndex;
    }

    private void swap(int[] arr, int x, int y)
    {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
