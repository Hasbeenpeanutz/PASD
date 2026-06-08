
public class BinaryTreeArrayMain05 {

    public static void main(String[] args) {
        BinaryTreeArray05 bta = new BinaryTreeArray05();
        Student05 m1 = new Student05("244107020138", "Devin", "TI-1I", 3.57);
        Student05 m2 = new Student05("244107020023", "Dewi", "TI-1I", 3.85);
        Student05 m3 = new Student05("244107020225", "Wahyu", "TI-1I", 3.21);
        Student05 m4 = new Student05("244107020076", "Angelina", "TI-1I", 3.54);
        Student05 m5 = new Student05("244107020223", "Andhika", "TI-1I", 3.72);
        Student05 m6 = new Student05("244107020226", "Bima", "TI-1I", 3.37);
        Student05 m7 = new Student05("244107020181", "Eiyu", "TI-1I", 3.46);
        Student05[] data = {m1, m2, m3, m4, m5, m6, m7};
        bta.populateData(data, data.length - 1);
        System.out.println("In-order traversal:");
        bta.traverseInOrder(0);

        
    }
}
