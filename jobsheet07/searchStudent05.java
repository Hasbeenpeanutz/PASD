package jobsheet07;

public class searchStudent05 {
    students05[] ListStd05 = new students05[5];
    int idx;

    void add(students05 std){
        if(idx < ListStd05.length){
            ListStd05[idx] = std;
            idx++;
        } else {
            System.out.println("Data is already full");
        }
    }

    void display(){
        for(students05 s : ListStd05){
            s.display();
            System.out.println("-----------------------------------");
        }
    }

    int findSeqSearch(int search){
        int position = -1;

        for(int i = 0; i < ListStd05.length; i++){
            if(ListStd05[i].nim == search){
                position = i;
                break;
            }
        }

        return position;
    }

    void showPosition(int x, int pos){
        if(pos != -1){
            System.out.println("Data with NIM " + x + " found at index " + pos);
        } else {
            System.out.println("Data with NIM " + x + " is not found");
        }
    }

    void showData(int x, int pos){
        if(pos != -1){
            System.out.println("NIM \t : " + x);
            System.out.println("Name \t : " + ListStd05[pos].name);
            System.out.println("Age \t : " + ListStd05[pos].age);
            System.out.println("GPA \t : " + ListStd05[pos].gpa);
        } else {
            System.out.println("Data " + x + " is not found");
        }
    }

    public int FindBinarySearch(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == ListStd05[mid].nim) {
                return (mid);
            } else if (ListStd05[mid].nim > cari) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }
}
