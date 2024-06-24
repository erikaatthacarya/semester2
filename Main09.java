import java.util.Scanner;

public class Main09 {
    public static void main(String[] args) {
        ProductManager09 manager = new ProductManager09();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("=================================");
            System.out.println("|      Menu Toko Madura '09'    |");
            System.out.println("=================================");
            System.out.println("1. Tambah Produk");
            System.out.println("2. Hapus Produk");
            System.out.println("3. Dapatkan Produk");
            System.out.println("4. Cetak Semua Produk");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan Anda: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();  // Konsumsi newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama barang: ");
                    String namaBarang = scanner.nextLine();
                    System.out.print("Masukkan stok: ");
                    int stok = scanner.nextInt();
                    System.out.print("Masukkan harga: ");
                    double harga = scanner.nextDouble();
                    scanner.nextLine();  // Konsumsi newline
                    manager.tambahProduk(new Product09(namaBarang, stok, harga));
                    break;
                case 2:
                    System.out.print("Masukkan nama barang yang akan dihapus: ");
                    namaBarang = scanner.nextLine();
                    manager.hapusProduk(namaBarang);
                    break;
                case 3:
                    System.out.print("Masukkan nama barang yang akan dicari: ");
                    namaBarang = scanner.nextLine();
                    Product09 produk = manager.dapatkanProduk(namaBarang);
                    if (produk != null) {
                        System.out.println(produk);
                    } else {
                        System.out.println("Produk tidak ditemukan.");
                    }
                    break;
                case 4:
                    manager.cetakSemuaProduk();
                    break;
                case 5:
                    System.out.println("Keluar...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilihan != 5);

        scanner.close();
    }
}
