package jobsheet07;


public class sortMain05 {
    public static void main(String[] args) {
        int data[] = {10, 40, 30, 50, 70, 20, 100, 90};
        
        System.out.println("Sorting with merge sort");
        mergeSort05 mSort = new mergeSort05();
        
        System.out.println("Initial Data");
        mSort.printArray(data);
        
        mSort.mergeSort(data);
        
        System.out.println("Sorted Data");
        mSort.printArray(data);
    }
}
