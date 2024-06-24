import java.util.Scanner;

public class LinkedList09 {
    private Node09 head;

    public LinkedList09() {
        head = null;
        // Menambahkan data awal
        tambahProduk(new ProductLL09("Beras",         50, 10000));
        tambahProduk(new ProductLL09("Gula",          30, 12000));
        tambahProduk(new ProductLL09("Minyak Goreng", 20, 15000));
        tambahProduk(new ProductLL09("Kopi",          40, 5000));
    }

    public void tambahProduk(ProductLL09 produk) {
        Node09 newNode09 = new Node09(produk);
        if (head == null) {
            head = newNode09;
        } else {
            Node09 current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode09;
        }
    }

    public void hapusProduk(String namaBarang) {
        if (head == null) return;

        if (head.data.getNamaBarang().equalsIgnoreCase(namaBarang)) {
            head = head.next;
            return;
        }

        Node09 current = head;
        while (current.next != null && !current.next.data.getNamaBarang().equalsIgnoreCase(namaBarang)) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    public ProductLL09 dapatkanProduk(String namaBarang) {
        Node09 current = head;
        while (current != null) {
            if (current.data.getNamaBarang().equalsIgnoreCase(namaBarang)) {
                return current.data;
            }
            current = current.next;
        }
        return null;
    }

    public void cetakSemuaProduk() {
        Node09 current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    // public static void main(String[] args) {
    //     LinkedList09 list = new LinkedList09();
    //     Scanner scanner = new Scanner(System.in);
    //     int pilihan;

    //     do {
    //         System.out.println("=================================");
    //         System.out.println("|      Menu Toko Madura '09'    |");
    //         System.out.println("=================================");
    //         System.out.println("1. Tambah Produk");
    //         System.out.println("2. Hapus Produk");
    //         System.out.println("3. Dapatkan Produk");
    //         System.out.println("4. Cetak Semua Produk");
    //         System.out.println("5. Keluar");
    //         System.out.print("Masukkan pilihan Anda: ");
    //         pilihan = scanner.nextInt();
    //         scanner.nextLine();  // Konsumsi newline

    //         switch (pilihan) {
    //             case 1:
    //                 System.out.print("Masukkan nama barang: ");
    //                 String namaBarang = scanner.nextLine();
    //                 System.out.print("Masukkan stok: ");
    //                 int stok = scanner.nextInt();
    //                 System.out.print("Masukkan harga: ");
    //                 double harga = scanner.nextDouble();
    //                 scanner.nextLine();  // Konsumsi newline
    //                 list.tambahProduk(new ProductLL09(namaBarang, stok, harga));
    //                 break;
    //             case 2:
    //                 System.out.print("Masukkan nama barang yang akan dihapus: ");
    //                 namaBarang = scanner.nextLine();
    //                 list.hapusProduk(namaBarang);
    //                 break;
    //             case 3:
    //                 System.out.print("Masukkan nama barang yang akan dicari: ");
    //                 namaBarang = scanner.nextLine();
    //                 ProductLL09 produk = list.dapatkanProduk(namaBarang);
    //                 if (produk != null) {
    //                     System.out.println(produk);
    //                 } else {
    //                     System.out.println("Produk tidak ditemukan.");
    //                 }
    //                 break;
    //             case 4:
    //                 list.cetakSemuaProduk();
    //                 break;
    //             case 5:
    //                 System.out.println("Keluar...");
    //                 break;
    //             default:
    //                 System.out.println("Pilihan tidak valid.");
    //                 break;
    //         }
    //     } while (pilihan != 5);

    //     scanner.close();
    // }
} 
