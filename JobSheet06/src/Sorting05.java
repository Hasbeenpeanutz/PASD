
class Sorting05 {

    int data[];
    int size;

    Sorting05(int dt[]) {
        this.data = dt;
        this.size = dt.length;
    }

    void bubbleSort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int tmp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = tmp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < size - 1; i++) {
            int min = i;
            for (int j = i + 1; j < size; j++) {
                if (data[j] < data[min]) {
                    min = j;
                }
            }
            int tmp = data[min];
            data[min] = data[i];
            data[i] = tmp;
        }
    }

    void insertionSort() {
        for (int i = 1; i < size; i++) {
            int temp = data[i];
            int j = i - 1;

            while (j >= 0 && data[j] > temp) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = temp;
        }
    }

    void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}
