public class ProductLL09 {
    private String namaBarang;
    private int stok;
    private double harga;

    // Konstruktor default
    public ProductLL09() {
    }

    // Konstruktor berparameter
    public ProductLL09(String namaBarang, int stok, double harga) {
        this.namaBarang = namaBarang;
        this.stok = stok;
        this.harga = harga;
    }

    // Getter dan Setter
    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    @Override
    public String toString() {
        return "Product : \tnamaBarang : '" + namaBarang + "', \tstok : " + stok + ", \tharga : " + harga + "";
    }
}
