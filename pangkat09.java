public class pangkat09 {
    public int nilai, pangkat;
    public int pangkat09;

    //konstruktor no 4
    public pangkat09(int nil, int pgkt){
        nilai = nil;
        pangkat = pgkt;
    }

    public int pangkat09BF(int a, int n) {
        int hasil = 1;
        for (int i = 0; i < n; i++) {
            hasil = hasil * a;
        }
        return hasil;
    }

    public int pangkat09DC(int a, int n) {
        if (n == 0) {
            return 1;
        } else {
            if (n % 2 == 1) {// bil ganjil
                return (pangkat09DC(a, n / 2) * pangkat09DC(a, n / 2) * a);
            } else {// bil genap
                return (pangkat09DC(a, n / 2) * pangkat09DC(a, n / 2));
            }
        }
    }
}
