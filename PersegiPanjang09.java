public class PersegiPanjang09 {
    public int panjang;
    public int lebar;

    public PersegiPanjang09(int p, int l) {
        panjang = p;
        lebar = l;
    }
    public PersegiPanjang09(){

    }

    public void cetakInfo(PersegiPanjang09[] arrayOfPersegiPanjang09){
        for (int i = 0; i < arrayOfPersegiPanjang09.length ; i++) {
            int luas = hitungLuas(arrayOfPersegiPanjang09[i].panjang, arrayOfPersegiPanjang09[i].lebar);
            int keliling = hitungKeliling(arrayOfPersegiPanjang09[i].panjang, arrayOfPersegiPanjang09[i].lebar);
            System.out.println("Persegi panjang ke-" + (i + 1)+ ", panjang: " + arrayOfPersegiPanjang09[i].panjang + ", lebar: " + arrayOfPersegiPanjang09[i].lebar+", luas: "+ luas+ ", keliling: "+keliling);
        }
    }
    public int hitungLuas(int p, int l){
        int luas = 0;
        luas = p * l;
        return luas;
    }
    public int hitungKeliling(int p, int l){
        int keliling = 0;
        keliling = 2*(p+l);
        return keliling;
    }
}
