package searchsort;

public class MergeSort extends Sort {
    /**
     * Sort the array arr using merge sort algorithm.
     */
    @Override
    public void sort(int[] arr) {
        int temp[] = new int[arr.length];
        merge(arr, )
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
            if(left[i] <= right[i])
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
