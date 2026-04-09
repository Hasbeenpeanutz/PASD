public class Main {
    public static void main(String[] args) {

        int a[] = {34, 8, 64, 51, 32, 21};
        Sorting sorting1 = new Sorting(a, a.length);
        sorting1.bubbleSort();
        sorting1.print();

        int b[] = {34, 8, 64, 51, 32, 21};
        Sorting sorting2 = new Sorting(b, b.length);
        sorting2.selectionSort();
        sorting2.print();

        int c[] = {34, 8, 64, 51, 32, 21};
        Sorting sorting3 = new Sorting(c, c.length);
        sorting3.insertionSort();
        sorting3.print();
    }
}

