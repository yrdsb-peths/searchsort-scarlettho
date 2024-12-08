package searchsort;

public class BinarySearch extends Search {
    /**
     * Find the index of the target element in the sorted array arr using binary
     * search. Return -1 if target is not found in arr.
     */
    @Override
    public int find(int[] arr, int target) {
        int first = 0;
        int last = arr.length - 1;
        while(first <= last)
        {
            int middle = (first + last) / 2;
            int cur = arr[middle];
            if(cur == target)
            {
                return cur;
            }
            else if(cur < target)
            {
                first = middle + 1;
            }
            else
            {
                last = middle - 1;
            }
        }
        return -1;
    }

    /**
     * Find the index of the target element in the sorted array arr using binary
     * search recursively. Return -1 if target is not found in arr.
     */
    @Override
    public int recursiveFind(int[] arr, int target) {
        return recursiveBinary(arr, target, 0, arr.length - 1);
    }

    public int recursiveBinary(int[]arr, int target, int first, int last)
    {
        if(first > last)
        {
            return -1;
        }
        int middle = (first + last) / 2;
        if(arr[middle] == target)
        {
            return middle;
        }
        else if (arr[middle] < target) 
        {
            return recursiveBinary(arr, target, middle + 1, last);
        }
        else
        {
            return recursiveBinary(arr, target, first, middle - 1);
        }

    }
}
