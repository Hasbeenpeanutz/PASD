class LecturerData05 {
    Lecturer05[] data = new Lecturer05[10];
    int idx = 0;

    void add(Lecturer05 d) {
        data[idx++] = d;
    }

    void print() {
        for (int i = 0; i < idx; i++) {
            data[i].print();
        }
        System.out.println();
    }

    // ASC (Bubble)
    void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (data[j].age > data[j + 1].age) {
                    Lecturer05 temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    // DSC (Selection)
    void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int max = i;
            for (int j = i + 1; j < idx; j++) {
                if (data[j].age > data[max].age) {
                    max = j;
                }
            }
            Lecturer05 temp = data[max];
            data[max] = data[i];
            data[i] = temp;
        }
    }
}