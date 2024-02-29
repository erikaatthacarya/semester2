public class Buku09 {

    String judul, pengarang;
    int halaman, stok, harga;
    double hargaTotal, diskon, hargaBayar;

    public Buku09(){

    }
    public Buku09(String jud, String pg, int hal, int stok, int har){
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok; // menggunakan this karena parameter sm atribut sm
        harga = har;
    }
    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga total: Rp " + hargaTotal);
        System.out.println("Harga diskon: Rp " + diskon);
        System.out.println("Harga bayar: Rp " + hargaBayar);
    }
    void terjual(int jml) {
        if (stok >= jml) {
            stok -= jml;
        }
    }
    void restock(int jml) {
        stok += jml;
    }
    void gantiHarga(int hrg) {
        harga = hrg;
    }
    void hitungHargaTotal(int jml) {
        hargaTotal = harga * jml;
    }
    void hitungDiskon() {
        if (hargaTotal > 150000) {
            diskon = hargaTotal * 0.12;
        } else if (hargaTotal >= 75000 && hargaTotal <= 150000) {
            diskon = hargaTotal * 0.05;
        }
    }
    void hitungHargaBayar(){
        hitungDiskon();
        hargaBayar = hargaTotal - diskon;
    }
}

