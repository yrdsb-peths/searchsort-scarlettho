package searchsort;

public class InsertionSort {
    /**
     * Sort the array arr using insertion sort algorithm.
     */
    public static void sort(int[] arr) {
        for(int i = 0; i < arr.length; i++)
        {
            int currentNum = arr[i];

            int currentIndex = i - 1;
            while(currentIndex >= 0 && arr[currentIndex] > currentNum)
            {
                arr[currentIndex + 1] = arr[currentIndex];
                currentIndex--;
            }

            arr[currentIndex + 1] = currentNum;
        }
    }
}
