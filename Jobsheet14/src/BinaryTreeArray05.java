
public class BinaryTreeArray05 {

    Student05[] data;
    int idxLast;

    public BinaryTreeArray05() {
        data = new Student05[10];
        idxLast = -1;
    }

    void populateData(Student05[] data, int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (data[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                data[idxStart].print();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }

    public void add(Student05 student) {
        idxLast++;

        if (idxLast < data.length) {
            data[idxLast] = student;
        } else {
            System.out.println("Array is full!");
        }
    }

    public void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (data[idxStart] != null) {

                data[idxStart].print();

                traversePreOrder(2 * idxStart + 1);

                traversePreOrder(2 * idxStart + 2);
            }
        }
    }
}
