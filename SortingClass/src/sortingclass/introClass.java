package sortingclass;

public class introClass {

    public void sort(int[] array)
    {
        sort(array, 0, array.length);
    }
    
    private void sort(int[] array, int low, int high)
    {
        int rangeLength = high - low;
        if (rangeLength < 2) {
            return;
        }
        int depth = (int)(5 * Math.log(rangeLength) / Math.log(2.0)) / 3;
        intro(array, low, high, depth);
    }

    private void intro(int[] array, int low, int high, int depth)
    {
        heapClass h = new heapClass();
        int rangeLength = high - low;
        if (rangeLength < 2){
            return;
        }

        if (depth == 0) {
            h.sort(array);
            return;
        }
        int q = partition(array, low, high);
        intro(array, low, q, depth - 1);
        intro(array, q + 1, high, depth - 1);
    }

    private int partition(int[] array, int low, int high)
    {
        int pivot = array[high - 1];
        int i = low - 1;
        for (int j = low; j < high - 1; ++j){
            if (array[j] <= pivot){
                int temp = array[++i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[++i];
        array[i] = array[high - 1];
        array[high - 1] = temp;
        return i;
    }
    
    public void printArray(int[] arr)
    {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }
}