public class faktorial09 {
    public int nilai;

    public faktorial09() {}
    public int faktorial09BF(int n) {
        int fakto = 1;
        int i = 1;
        while (i <= n) {
            fakto = fakto * i;
            i++;
        }
        // for (int i = 1; i <= n; i++) {
        //     fakto = fakto * i;
        // }
        return fakto;
    }

    public int faktorial09DC(int n) {
        if (n <= 1) {
            return 1;
        } else {
            int fakto = n * faktorial09DC(n - 1);
            return fakto;
        }
    }
}
