package sortingclass;

public class dualPivotQuickClass {
    
    public void sort(int[] array){
        sort(array,0,array.length - 1);
    }
    
    
    private void sort(int[] array, int low, int high) 
    { 
        if (low < high){  
            int[] lprpIndexes; // = new int[2]
            lprpIndexes = partition(array, low, high);
            sort(array, low, lprpIndexes[0] - 1); 
            sort(array, lprpIndexes[0] + 1, lprpIndexes[1] - 1); 
            sort(array, lprpIndexes[1] + 1, high); 
        } 
    }

    private int[] partition(int[] array, int low, int high) 
    {
        int[] returned = new int[2];
        if (array[low] > array[high]){
            int temp = array[low];
            array[low] = array[high];
            array[high] = temp;
        }
        
        int l = low + 1, r = high - 1;
        int x = low + 1, y = array[low], z = array[high];
        while (x <= r){
            if (array[x] < y){
                int temp = array[x];
                array[x] = array[l];
                array[l] = temp;
                l++;
            }
            else if (array[x] >= z){
                while (array[r] > z && x < r){
                    r--;
                }
                int temp = array[x];
                array[x] = array[r];
                array[r] = temp;
                r--;
                if (array[x] < y){
                    temp = array[x];
                    array[x] = array[l];
                    array[l] = temp;
                    l++;
                }
            }
            x++;
        }
        l--;
        r++;
        
        int temp = array[low];
        array[low] = array[l];
        array[l] = temp;
        
        temp = array[high];
        array[high] = array[r];
        array[r] = temp;
        
        returned[0] = l;//left pivot
        returned[1] = r;//right pivot
        
        return returned;
    }
    
    public void printArray(int[] arr){
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }
}
