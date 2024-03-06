public class Pembelian {
    public Pembelian(barang09 barang){
    }
    public String toString(){
        Object kode;
        Object nama;
        String harga;
        Object stok;
        return String.format("%s - %s (Rp%d) | Stok: %d", kode, nama, Integer.parseInt(harga), stok);
    }
}
