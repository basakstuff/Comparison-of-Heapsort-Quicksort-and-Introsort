package sortingclass;
import java.util.Random;



public class SortingClass{
    
    
       
    void heapSort (int[] arrayToSort)
    {
        heapClass h = new heapClass();
        h.sort(arrayToSort);
       //h.printArray(arrayToSort);
    }
    void quickSort (int[] arrayToSort, String pivotType)
    {
        quickClass q = new quickClass(pivotType);
        q.sort(arrayToSort);
        //q.printArray(arrayToSort);
    }
    
    void dualPivotQuickSort (int[] arrayToSort)
    {
        dualPivotQuickClass d = new dualPivotQuickClass();
        d.sort(arrayToSort);
        //d.printArray(arrayToSort);
    }
    
    void introSort (int[] arrayToSort)
    {
        introClass i = new introClass();
        i.sort(arrayToSort);
        //i.printArray(arrayToSort);
    }
    
    public static int[] GenerateArray(int count, String arrayType)
    {
        int[] genArray = new int[count];  
        if(arrayType == "Equal"){
            for(int i=0;i<genArray.length;i++){
                genArray[i] = 5;
            }
        }
        else if(arrayType == "Random"){
            Random r = new Random();
            for(int i=0;i<genArray.length;i++){
                genArray[i] = r.nextInt(count);
            }
        }
        else if(arrayType == "Asc"){
            for(int i=0;i<genArray.length;i++){
                genArray[i] = i + 1;
            }
        }
        else if(arrayType == "Desc"){
            for(int i=0;i<genArray.length;i++){
                genArray[i] = genArray.length - i;
            }
        }
        return genArray;
    }
    
    public static void main(String[] args) {
                
        SortingClass a = new SortingClass();
        long startTime;
        long estimatedTime;
       
        int[] equal_1k = GenerateArray(1000, "Equal");
        int[] equal_10k = GenerateArray(10000, "Equal");
        int[] equal_100k = GenerateArray(100000, "Equal");
        
        
        int[] random_1k = GenerateArray(1000, "Random");
        int[] random_10k = GenerateArray(10000, "Random");
        int[] random_100k = GenerateArray(100000, "Random");
       
        int[] asc_1k = GenerateArray(1000, "Asc");
        int[] asc_10k = GenerateArray(10000, "Asc");
        int[] asc_100k = GenerateArray(100000, "Asc");
        
        int[] desc_1k = GenerateArray(1000, "Desc");
        int[] desc_10k = GenerateArray(10000, "Desc");
        int[] desc_100k = GenerateArray(100000, "Desc");
        
        
        /*
         *          HEAPSORT -- EQUAL
         */
        System.out.print("heapSort:\n\tEqual\n\t1000:");
        startTime = System.nanoTime();
        a.heapSort(equal_1k);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("\t" + estimatedTime + " ns");
        
        
        System.out.print("\t10000:");
        startTime = System. nanoTime();
        a.heapSort(equal_10k);
        estimatedTime = System. nanoTime() - startTime;
        System.out.println("\t" + estimatedTime + " ns");
        
        System.out.print("\t100000:");
        startTime = System.nanoTime();
        a.heapSort(equal_100k);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("\t" + estimatedTime + " ns\n");
        
        /*
         * HEAPSORT -- RANDOM
         */
        System.out.print("\tRandom\n\t1000:");
        startTime = System.nanoTime();
        a.heapSort(random_1k);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("\t" + estimatedTime + " ns");
        
        System.out.print("\t10000:");
        startTime = System. nanoTime();
        a.heapSort(random_10k);
        estimatedTime = System. nanoTime() - startTime;
        System.out.println("\t" + estimatedTime + " ns");
        
        System.out.print("\t100000:");
        startTime = System. nanoTime();
        a.heapSort(random_100k);
        estimatedTime = System. nanoTime() - startTime;
        System.out.println("\t" + estimatedTime + " ns\n");
        
        /*
         * HEAPSORT -- ASC
         */
        
        System.out.print("\tAsc\n\t1000:");
        startTime = System. nanoTime();
        a.heapSort(asc_1k);
        estimatedTime = System. nanoTime() - startTime;
        System.out.println("\t" + estimatedTime + " ns");
        
        System.out.print("\t10000:");
        startTime = System. nanoTime();
        a.heapSort(asc_10k);
        estimatedTime = System. nanoTime() - startTime;
        System.out.println("\t" + estimatedTime + " ns");
        
        System.out.print("\t100000:");
        startTime = System. nanoTime();
        a.heapSort(asc_100k);
        estimatedTime = System. nanoTime() - startTime;
        System.out.println("\t" + estimatedTime + " ns\n");
        
        /*
         *  HEAPSORT -- DESC
         */
        System.out.print("\tDesc\n\t1000:");
        startTime = System. nanoTime();
        a.heapSort(desc_1k);
        estimatedTime = System. nanoTime() - startTime;
        System.out.println("\t" + estimatedTime + " ns");
        
        System.out.print("\t10000:");
        startTime = System. nanoTime();
        a.heapSort(desc_10k);
        estimatedTime = System. nanoTime() - startTime;
        System.out.println("\t" + estimatedTime + " ns");
        
        System.out.print("\t100000:");
        startTime = System. nanoTime();
        a.heapSort(desc_100k);
        estimatedTime = System. nanoTime() - startTime;
        System.out.println("\t" + estimatedTime + " ns\n");
        System.out.println("--------------------------------------------------------------------------");
        
        /*
         * QUICKSORT - FIRSTELEMENT -- EQUAL
         */
       
        System.out.print("quickSort Pivot as First Element:\n\tEqual\n\t1000:");
        startTime = System. nanoTime();
        a.quickSort(equal_1k, "FirstElement");
        estimatedTime = System. nanoTime() - startTime;
        System.out.println("\t" + estimatedTime + " ns");
        
        System.out.print("\t10000:");
        startTime = System. nanoTime();
        a.quickSort(equal_10k, "FirstElement");
        estimatedTime = System. nanoTime() - startTime;
        System.out.println("\t" + estimatedTime + " ns");
        
        System.out.print("\t100000:");
        startTime = System. nanoTime();
        a.quickSort(equal_100k, "FirstElement");                                                       
        estimatedTime = System. nanoTime() - startTime;
        System.out.println("\t" + estimatedTime + " ns\n");
       
        /*
         *  QUICKSORT - FIRSTELEMENT -- RANDOM
         */
        System.out.print("\tRandom\n\t1000:");
        startTime = System. nanoTime();
        a.quickSort(random_1k, "FirstElement");
        estimatedTime = System. nanoTime() - startTime;
        System.out.println("\t" + estimatedTime + " ns");
        
        System.out.print("\t10000:");
        startTime = System. nanoTime();
        a.quickSort(random_10k, "FirstElement");
        estimatedTime = System. nanoTime() - startTime;
        System.out.println("\t" + estimatedTime + " ns");
        
        System.out.print("\t100000:");
        startTime = System.nanoTime();
        a.quickSort(random_100k, "FirstElement");
        estimatedTime = System. nanoTime() - startTime;
        System.out.println("\t" + estimatedTime + " ns\n");
        
        /*
         * QUICKSORT - FIRSTELEMENT -- ASC
         */
        System.out.print("\tAsc\n\t1000:");
        startTime = System.nanoTime();
        a.quickSort(asc_1k, "FirstElement");
        estimatedTime = System. nanoTime() - startTime;
        System.out.println("\t" + estimatedTime + " ns");
        
        System.out.print("\t10000:");
        startTime = System. nanoTime();
        a.quickSort(asc_10k, "FirstElement");
        estimatedTime = System. nanoTime() - startTime;
        System.out.println("\t" + estimatedTime + " ns");
        
        System.out.print("\t100000:");
        startTime = System. nanoTime();
        a.quickSort(asc_100k, "FirstElement");                                                    
        estimatedTime = System. nanoTime() - startTime;
        System.out.println("\t" + estimatedTime + " ns\n");
        
        /*
         * QUICKSORT - FIRSTELEMENT -- DESC
         */
        System.out.print("\tDesc\n\t1000:");
        startTime = System.nanoTime();
        a.quickSort(desc_1k, "FirstElement");
        estimatedTime = System. nanoTime() - startTime;
        System.out.println("\t" + estimatedTime + " ns");
        
        System.out.print("\t10000:");
        startTime = System. nanoTime();
        a.quickSort(desc_10k, "FirstElement");
        estimatedTime = System. nanoTime() - startTime;
        System.out.println("\t" + estimatedTime + " ns");
        
        System.out.print("\t100000:");
        startTime = System. nanoTime();
        a.quickSort(desc_100k, "FirstElement");                                           
        estimatedTime = System. nanoTime() - startTime;
        System.out.println("\t" + estimatedTime + " ns\n");
        
        /*
         * QUICKSORT - RANDOMELEMENT -- EQUAL
         */
        System.out.print("quickSort Pivot as Random Element:\n\tEqual\n\t1000:");
        startTime = System. nanoTime();
        a.quickSort(equal_1k, "RandomElement");
        estimatedTime = System. nanoTime() - startTime;
        System.out.println("\t" + estimatedTime + " ns");
        
        System.out.print("\t10000:");
        startTime = System. nanoTime();
        a.quickSort(equal_10k, "RandomElement");
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("\t" + estimatedTime + " ns");
        
        System.out.print("\t100000:");
        startTime = System. nanoTime();
        a.quickSort(equal_100k, "RandomElement");                                                        
        estimatedTime = System. nanoTime() - startTime;
        System.out.println("\t" + estimatedTime + " ns\n");
        
        /*
         * QUICKSORT - RANDOMELEMENT -- RANDOM
         */
        System.out.print("\tRandom\n\t1000:");
        startTime = System. nanoTime();
        a.quickSort(random_1k, "RandomElement");
        estimatedTime = System. nanoTime() - startTime;
        System.out.println("\t" + estimatedTime + " ns");
        
        System.out.print("\t10000:");
        startTime = System. nanoTime();
        a.quickSort(random_10k, "RandomElement");
        estimatedTime = System. nanoTime() - startTime;
        System.out.println("\t" + estimatedTime + " ns");
        
        System.out.print("\t100000:");
        startTime = System. nanoTime();
        a.quickSort(random_100k, "RandomElement");
        estimatedTime = System. nanoTime() - startTime;
        System.out.println("\t" + estimatedTime + " ns\n");
        
        /*
         * QUICKSORT - RANDOMELEMENT -- ASC
         */
        System.out.print("\tAsc\n\t1000:");
        startTime = System. nanoTime();
        a.quickSort(asc_1k, "RandomElement");
        estimatedTime = System. nanoTime() - startTime;
        System.out.println("\t" + estimatedTime + " ns");
        
        System.out.print("\t10000:");
        startTime = System. nanoTime();
        a.quickSort(asc_10k, "RandomElement");
        estimatedTime = System. nanoTime()- startTime;
        System.out.println("\t" + estimatedTime + " ns");
        
        System.out.print("\t100000:");
        startTime = System. nanoTime();
        a.quickSort(asc_100k, "RandomElement");                                                 
        estimatedTime = System. nanoTime() - startTime;
        System.out.println("\t" + estimatedTime + " ns\n");
        
        /*
         * QUICKSORT - RANDOMELEMENT -- DESC
         */
        System.out.print("\tDesc\n\t1000:");
        startTime = System. nanoTime();
        a.quickSort(desc_1k, "RandomElement");
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("\t" + estimatedTime + " ns");
        
        System.out.print("\t10000:");
        startTime = System. nanoTime();
        a.quickSort(desc_10k, "RandomElement");
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("\t" + estimatedTime + " ns");
        
        System.out.print("\t100000:");
        startTime = System. nanoTime();
        a.quickSort(desc_100k, "RandomElement");                                          
        estimatedTime = System. nanoTime() - startTime;
        System.out.println("\t" + estimatedTime + " ns\n");
        
        /*
         * QUICKSORT - MIDELEMENT -- EQUAL
         */
        System.out.print("quickSort Pivot as Mid Element:\n\tEqual\n\t1000:");
        startTime = System. nanoTime();
        a.quickSort(equal_1k, "MiddleElement");
        estimatedTime = System. nanoTime() - startTime;
        System.out.println("\t" + estimatedTime + " ns");
        
        System.out.print("\t10000:");
        startTime = System. nanoTime();
        a.quickSort(equal_10k, "MiddleElement");
        estimatedTime = System. nanoTime() - startTime;
        System.out.println("\t" + estimatedTime + " ns");
        
        System.out.print("\t100000:");
        startTime = System. nanoTime();
        a.quickSort(equal_100k, "MiddleElement");                                                      
        estimatedTime = System. nanoTime() - startTime;
        System.out.println("\t" + estimatedTime + " ns\n");
        
        /*
         * QUICKSORT - MIDELEMENT -- RANDOM
         */
        System.out.print("\tRandom\n\t1000:");
        startTime = System. nanoTime();
        a.quickSort(random_1k, "MiddleElement");
        estimatedTime = System. nanoTime() - startTime;
        System.out.println("\t" + estimatedTime + " ns");
        
        System.out.print("\t10000:");
        startTime = System. nanoTime();
        a.quickSort(random_10k, "MiddleElement");
        estimatedTime = System. nanoTime() - startTime;
        System.out.println("\t" + estimatedTime + " ns");
        
        System.out.print("\t100000:");
        startTime = System. nanoTime();
        a.quickSort(random_100k, "MiddleElement");
        estimatedTime = System. nanoTime() - startTime;
        System.out.println("\t" + estimatedTime + " ns\n");
        
        /*
         * QUICKSORT - MIDELEMENT -- ASC
         */
        System.out.print("\tAsc\n\t1000:");
        startTime = System. nanoTime();
        a.quickSort(asc_1k, "MiddleElement");
        estimatedTime = System. nanoTime() - startTime;
        System.out.println("\t" + estimatedTime + " ns");
        
        System.out.print("\t10000:");
        startTime = System. nanoTime();
        a.quickSort(asc_10k, "MiddleElement");
        estimatedTime = System. nanoTime() - startTime;
        System.out.println("\t" + estimatedTime + " ns");
        
        System.out.print("\t100000:");
        startTime = System. nanoTime();
        a.quickSort(asc_100k, "MiddleElement");                                                    
        estimatedTime = System. nanoTime() - startTime;
        System.out.println("\t" + estimatedTime + " ns\n");
        
        /*
         * QUICKSORT - MIDELEMENT -- DESC
         */
        System.out.print("\tDesc\n\t1000:");
        startTime = System. nanoTime();
        a.quickSort(desc_1k, "MiddleElement");
        estimatedTime = System. nanoTime() - startTime;
        System.out.println("\t" + estimatedTime + " ns");
        
        System.out.print("\t10000:");
        startTime = System. nanoTime();
        a.quickSort(desc_10k, "MiddleElement");
        estimatedTime = System. nanoTime() - startTime;
        System.out.println("\t" + estimatedTime + " ns");
        
        System.out.print("\t100000:");
        startTime = System. nanoTime();
        a.quickSort(desc_100k, "MiddleElement");                                           
        estimatedTime = System. nanoTime() - startTime;
        System.out.println("\t" + estimatedTime + " ns\n");
        System.out.println("--------------------------------------------------------------------------");
        
        /*
         * DUALPIVOTQUICKSORT -- EQUAL
         */
        System.out.print("dualPivotQuickSort:\n\tEqual\n\t1000:");
        startTime = System. nanoTime();
        a.dualPivotQuickSort(equal_1k);
        estimatedTime = System. nanoTime() - startTime;
        System.out.println("\t" + estimatedTime + " ns");
        
        System.out.print("\t10000:");
        startTime = System. nanoTime();
        a.dualPivotQuickSort(equal_10k);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("\t" + estimatedTime + " ns");
        
        System.out.print("\t100000:");
        startTime = System.nanoTime();
        a.dualPivotQuickSort(equal_100k);                                                         
        estimatedTime = System. nanoTime()- startTime;
        System.out.println("\t" + estimatedTime + " ns\n");
        
        /*
         * DUALPIVOTQUICKSORT -- RANDOM
         */
        System.out.print("\tRandom\n\t1000:");
        startTime = System. nanoTime();
        a.dualPivotQuickSort(random_1k);
        estimatedTime = System. nanoTime() - startTime;
        System.out.println("\t" + estimatedTime + " ns");
        
        System.out.print("\t10000:");
        startTime = System. nanoTime();
        a.dualPivotQuickSort(random_10k);
        estimatedTime = System. nanoTime() - startTime;
        System.out.println("\t" + estimatedTime + " ns");
        
        System.out.print("\t100000:");
        startTime = System. nanoTime();
        a.dualPivotQuickSort(random_100k);                                                          
        estimatedTime = System. nanoTime() - startTime;
        System.out.println("\t" + estimatedTime + " ns\n");
        
        /*
         * DUALPIVOTQUICKSORT -- ASC
         */
        System.out.print("\tAsc\n\t1000:");
        startTime = System. nanoTime();
        a.dualPivotQuickSort(asc_1k);
        estimatedTime = System. nanoTime() - startTime;
        System.out.println("\t" + estimatedTime + " ns");
        
        System.out.print("\t10000:");
        startTime = System. nanoTime();
        a.dualPivotQuickSort(asc_10k);
        estimatedTime = System. nanoTime() - startTime;
        System.out.println("\t" + estimatedTime + " ns");
        
        System.out.print("\t100000:");
        startTime = System. nanoTime();
        a.dualPivotQuickSort(asc_100k);                                                                                                    
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("\t" + estimatedTime + " ns\n");
        
        /*
         * DUALPIVOTQUICKSORT -- DESC
         */
        System.out.print("\tDesc\n\t1000:");
        startTime = System. nanoTime();
        a.dualPivotQuickSort(desc_1k);
        estimatedTime = System. nanoTime() - startTime;
        System.out.println("\t" + estimatedTime + " ns");
        
        System.out.print("\t10000:");
        startTime = System.nanoTime();
        a.dualPivotQuickSort(desc_10k);
        estimatedTime = System. nanoTime() - startTime;
        System.out.println("\t" + estimatedTime + " ns");
        
        System.out.print("\t100000:");
        startTime = System.nanoTime();
        a.dualPivotQuickSort(desc_100k);                                                          
        estimatedTime = System. nanoTime() - startTime;
        System.out.println("\t" + estimatedTime + " nms\n");
        System.out.println("--------------------------------------------------------------------------");
        
        /*
         * INTROSORT -- EQUAL
         */
        System.out.print("introSort:\n\tEqual\n\t1000:");
        startTime = System. nanoTime();
        a.introSort(equal_1k);
        estimatedTime = System. nanoTime() - startTime;
        System.out.println("\t" + estimatedTime + " ns");
        
        System.out.print("\t10000:");
        startTime = System. nanoTime();
        a.introSort(equal_10k);
        estimatedTime = System. nanoTime() - startTime;
        System.out.println("\t" + estimatedTime + " ns");
        
        System.out.print("\t100000:");
        startTime = System. nanoTime();
        a.introSort(equal_100k);                                                         
        estimatedTime = System. nanoTime() - startTime;
        System.out.println("\t" + estimatedTime + " ns\n");
        
        /*
         * INTROSORT -- RANDOM
         */
        System.out.print("\tRandom\n\t1000:");
        startTime = System. nanoTime();
        a.introSort(random_1k);
        estimatedTime = System. nanoTime() - startTime;
        System.out.println("\t" + estimatedTime + " ns");
        
        System.out.print("\t10000:");
        startTime = System. nanoTime();
        a.introSort(random_10k);
        estimatedTime = System. nanoTime() - startTime;
        System.out.println("\t" + estimatedTime + " ns");
        
        System.out.print("\t100000:");
        startTime = System. nanoTime();
        a.introSort(random_100k);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("\t" + estimatedTime + " ns\n");
        
        /*
         * INTROSORT -- ASC
         */
        System.out.print("\tAsc\n\t1000:");
        startTime = System. nanoTime();
        a.introSort(asc_1k);
        estimatedTime = System. nanoTime() - startTime;
        System.out.println("\t" + estimatedTime + " ns");
        
        System.out.print("\t10000:");
        startTime = System.nanoTime();
        a.introSort(asc_10k);
        estimatedTime = System. nanoTime() - startTime;
        System.out.println("\t" + estimatedTime + " ns");
        
        System.out.print("\t100000:");
        startTime = System. nanoTime();
        a.introSort(asc_100k);                                                                                          
        estimatedTime = System.nanoTime()- startTime;
        System.out.println("\t" + estimatedTime + " ns\n");
              
        /*
         * INTROSORT -- DESC
         */
        System.out.print("\tDesc\n\t1000:");
        startTime = System. nanoTime();
        a.introSort(desc_1k);
        estimatedTime = System. nanoTime() - startTime;
        System.out.println("\t" + estimatedTime + " ns");        
        System.out.print("\t10000:");
        startTime = System. nanoTime();
        a.introSort(desc_10k);
        estimatedTime = System. nanoTime() - startTime;
        System.out.println("\t" + estimatedTime + " ns");
        
        System.out.print("\t100000:");
        startTime = System. nanoTime();
        a.introSort(desc_100k);                                            
        estimatedTime = System. nanoTime() - startTime;
        System.out.println("\t" + estimatedTime + " ns\n");
        
      
        
    }
}