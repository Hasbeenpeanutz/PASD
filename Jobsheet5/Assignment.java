package Jobsheet5;

public class Assignment {
    // Max UTS (DC)
    public static int maxUTS(Student[] s, int l, int r) {
        if (l == r) return s[l].uts;

        int mid = (l + r) / 2;
        int left = maxUTS(s, l, mid);
        int right = maxUTS(s, mid+1, r);

        return Math.max(left, right);
    }

    // Min UTS (DC)
    public static int minUTS(Student[] s, int l, int r) {
        if (l == r) return s[l].uts;

        int mid = (l + r) / 2;
        int left = minUTS(s, l, mid);
        int right = minUTS(s, mid+1, r);

        return Math.min(left, right);
    }

    // Average UAS (BF)
    public static double avgUAS(Student[] s) {
        int total = 0;
        for (Student st : s) {
            total += st.uas;
        }
        return (double) total / s.length;
    }
}
