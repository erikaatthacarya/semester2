/**
 * barang09
 */
public class barang09 {

    private String kode;
    private String nama;
    private String harga;
    private int stok;

    public barang09(String kode, String nama, String string, String string2){
        this.kode = kode;
        this.kode = nama;
        this.harga = string;
    }
    public String getKode(){
        return kode;
    }
    public String getNama(){
        return nama;
    }
    public String getHarga(){
        return (String) harga;
    }
    public void setStok(int stok){
        this.stok = stok;
    }
    public String toString(){
        return String.format("%s - %s (Rp%d) | Stok: %d", kode, nama, harga, stok);
    }
    public int getStok() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getStok'");
    }
}
