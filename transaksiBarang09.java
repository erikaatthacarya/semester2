import java.util.Scanner;
public class transaksiBarang09 {
    private barang09[] barang;
    private Pembelian[] pembelians;
    Scanner sc = new Scanner(System.in);
    public transaksiBarang09() {
        barang = new barang09[]{
            new barang09("K01", "Sabun", "1000", "5"),
            new barang09("K02", "Pasta Gigi", "2000", "10"),
            new barang09("K03", "Biore", "3000", "23"),
            new barang09("K04", "Shampoo", "4000", "55"),
            new barang09("K05", "Sikat Gigi", "5000", "65")
        };
        pembelians = new Pembelian[0];
    }
    public void tampilkanBarang(){
        System.out.println("======Daftar Barang=====");
        for(barang09 barang : barang){
            System.out.println(barang);
        }
    }
    public void tampilkanBarangPembelian(){
        System.out.println("====Daftar Pembelian====");
        for (Pembelian pembelian : pembelians) {
            System.out.println(pembelian);
        }
    }
    public void lakukanPembelian(String kodeBarang) {
        barang09 barang = findBarangByKode(kodeBarang);
        if (barang != null) {
            if (barang.getStok() > 0) {
                Pembelian pembelian = new Pembelian(barang);
                barang.setStok(barang.getStok() - 1);
                addPembelian(pembelian);
                System.out.println("Pembelian " + barang.getNama() + " berhasil!");
            } else {
                System.out.println("Stok barang " + barang.getNama() + " habis!");
            }
        } else {
            System.out.println("Barang dengan kode " + kodeBarang + " tidak ditemukan!");
        }
    }
    private barang09 findBarangByKode(String kodeBarang) {
        for (barang09 barang : barang) {
            if (barang.getKode().equals(kodeBarang)) {
                return barang;
            }
        }
        return null;
    }
    private void addPembelian(Pembelian pembelian) {
        Pembelian[] newPembelians = new Pembelian[pembelians.length + 1];
        for (int i = 0; i < pembelians.length; i++) {
            newPembelians[i] = pembelians[i];
        }
        newPembelians[newPembelians.length - 1] = pembelian;
        pembelians = newPembelians;
    }
}
