public class SortingMain05 {
    public static void main(String[] args) { 
        int[] a = {34, 7, 23, 32, 5, 62};
        
        Sorting05 sortingdata = new Sorting05(a);
        System.out.println("Original Array: ");
        sortingdata.print();
        sortingdata.bubbleSort();
        System.out.println("Sorted array (bubble sort): ");
        sortingdata.print();

        int[] b = {30, 20, 2, 8, 14};
        Sorting05 sortingdata2 = new Sorting05(b);
        System.out.println("Original array:");
        sortingdata2.print();
        sortingdata2.selectionSort();
        System.out.println("Sorted array (Selection Sort):");
        sortingdata2.print();
        System.out.println("-------------------------");

        int[] c = {40, 10, 4, 9, 3};
        Sorting05 sortingdata3 = new Sorting05(c);
        System.out.println("Original array:");
        sortingdata3.print();
        sortingdata3.insertionSort();
        System.out.println("Sorted array (Insertion Sort):");
        sortingdata3.print();
    }
}
