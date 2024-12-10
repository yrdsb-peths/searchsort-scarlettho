package searchsort;

public class MergeSort extends Sort {
    /**
     * Sort the array arr using merge sort algorithm.
     */
    @Override
    public void sort(int[] arr) {
        if(arr.length <= 1)
        {
            return;
        }

        int middle = arr.length / 2;

        int[] left = new int[middle];
        int[] right = new int[arr.length - middle];

        int i = 0;
        int j = 0;

        for (; i < arr.length; i++) {
            if(i < middle)
            {
                left[i] = arr[i];
            }
            else
            {
                right[j] = arr[i];
                j++;
            }
        }
        sort(left);
        sort(right);

        merge(arr, left, right);
        
    }

    /*
     * Merge the two sorted arrays left and right into the array arr.
     */
    private void merge(int[] arr, int[] left, int[] right) {
        int leftSize = arr.length / 2;
        int rightSize = arr.length - leftSize;
        int i = 0;
        int l = 0;
        int r = 0;

        while(l < leftSize && r < rightSize)
        {
            if(left[l] <= right[r])
            {
                arr[i] = left[l];
                i++;
                l++;
            }
            else
            {
                arr[i] = right[r];
                i++;
                r++;
            }
        }
        while(i < leftSize)
        {
            arr[i] = left[l];
            i++;
            l++;
        }

        while(r < rightSize)
        {
            arr[i] = right[r];
            i++;
            r++;
        }
    }
}
