package searchsort;

public class MergeSort extends Sort {
    /**
     * Sort the array arr using merge sort algorithm.
     */
    @Override
    public void sort(int[] arr) {
        int[] temp = new int[arr.length];

        mergeSortHelper(arr, temp);
    }

    public void mergeSortHelper(int[] arr, int[] temp)
    {
        if(arr.length <= 1)
        {
            return;
        }

        int middle = arr.length / 2;

        int[] left = new int[middle];
        int[] right = new int[arr.length - middle];

        for (int i = 0; i < middle; i++) {
            left[i] = arr[i];
        }
        
        for (int i = middle; i < arr.length; i++) {
            right[i - middle] = arr[i];
        }
        mergeSortHelper(left, temp);
        mergeSortHelper(right, temp);

        merge(arr, left, right, temp);
    }
    /*
     * Merge the two sorted arrays left and right into the array arr.
     */
    private void merge(int[] arr, int[] left, int[] right, int[] temp) {
        int i = 0;
        int k = 0;
        int j = 0;

        while(i < left.length && j < right.length)
        {
            if(left[i] <= right[j])
            {
                temp[k] = left[i];
                k++;
                i++;
            }
            else
            {
                temp[k] = right[j];
                k++;
                j++;
            }
        }
        while(i < left.length)
        {
            temp[k] = left[i];
            k++;
            i++;
        }

        while(j < right.length)
        {
            temp[k] = right[j];
            k++;
            j++;
        }
        for(int n = 0; n < temp.length; n++)
        {
            arr[n] = temp[n];
        }
    }
}
