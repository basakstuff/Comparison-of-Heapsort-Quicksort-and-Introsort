package sortingclass;
public class heapClass {
    private static int n;
    
    public void sort(int [] array)
    {
        n = array.length-1;
        heapify(array);
    }

    private void heapify(int [] array)
    {
        for(int i = n; i >= 0; i--)
            heap(array,i);
    }

    private void heap(int [] array, int i)
    {
        int left = 2 * i + 1;
        int right= 2 * i + 2;
        int largest = i;

        if((left <= n) && (array[left] > array[largest])){
            largest = left;
        }
        if((right <= n) && (array[right] > array[largest]))
            largest = right;
        if(largest != i){
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;
            heap(array,largest);
        }
    }
    
    public void printArray(int[] arr)
    {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }
}
