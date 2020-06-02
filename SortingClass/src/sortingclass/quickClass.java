package sortingclass;
import java.util.Random;

public class quickClass {
    
    private String pivotType;
    
    public quickClass(String pivotType){
        this.pivotType = pivotType;
    }
    
    public void sort(int[] array){
        sort(array, 0, array.length - 1);
    }
    
    private void sort(int array[], int low, int high){
        if(pivotType == "FirstElement"){
            SortAsFP(array,low,high);
        }
        else if(pivotType == "RandomElement"){
            SortAsRP(array,low,high);
        }
        else if(pivotType == "MiddleElement"){
            int mid = (low + high) /2;
            SortAsMid(array,low,mid,high);
        }
    }
    
    private void SortAsFP(int[] array, int low, int high)
    {
        if (low < high){  
            int pivot = array[low]; 
            int i = low;
            int j = high;
            while (i < j){
                i++; 
                while (i <= high && array[i] < pivot) {
                    i++;
                }
                while (j >= low && array[j] > pivot) {
                    j--;
                }
                if (i <= high && i < j) {
                    int temp = array[i];
                    array[i]=array[j];
                    array[j] = temp;
                }
            }
            
            int temp = array[low];
            array[low] = array[j];
            array[j] = temp;
            SortAsFP(array, low, j - 1);
            SortAsFP(array, j + 1, high);
        }
    }
    
    
    private int partition(int array[], int low, int high) 
    { 
        int pivot = array[high]; 
        int i = (low - 1);
        for (int j = low; j <= high - 1; j++) { 
            if (array[j] <= pivot) { 
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            } 
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return (i + 1); 
    } 
  
    private int partition_rand(int array[], int low, int high) 
    { 
        Random r = new Random();
        int pivotIndex = r.nextInt(high - low) + low;
        int temp = array[pivotIndex];
        array[pivotIndex] = array[high];
        array[high] = temp;
        return partition(array, low, high); 
    }
    
    private void SortAsRP(int array[], int low, int high) 
    { 
        if (low < high){ 
            int pi = partition_rand(array, low, high); 
            SortAsRP(array, low, pi - 1); 
            SortAsRP(array, pi + 1, high); 
        } 
    }
    
    private void SortAsMid(int[] array, int low,int middle, int high)
    {
        if(low < high){
            int pivot = array[middle];
            int i = low, j = high;
            while (i <= j)
            {
                while (array[i] < pivot){
                    i++;
                }
                while (array[j] > pivot){
                    j--;
                }
                if (i <= j){
                    int temp = array[i];
                    array[i]=array[j];
                    array[j] = temp;
                    i++;
                    j--;
                }
            }
            if (low < j){
                int mid  = low + (j - low) / 2;
                SortAsMid(array, low,mid, j);
            }
            if (high > i){
                int mid = i + (high - i) / 2;
                SortAsMid(array,i,mid,high);
            }
        }
    }
    
    public void printArray(int[] arr){
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }
}
