import java.util.Scanner;
public class Fungsi09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi array untuk menyimpan nama bunga, stock awal, dan harga
        String[] namaBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
        int[] harga = {75000, 50000, 60000, 10000};
        int[][] stockBunga= {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };

        System.out.println("Pendapatan setiap cabang jika semua bunga habis terjual: ");
        for (int i = 0; i < stockBunga.length; i++) {
            int pendapatanCabang = hitungPendapatanCabang(stockBunga[i], harga);
            System.out.println("Cabang " + (i + 1) + ": Rp " + pendapatanCabang);
        }

        System.out.println("\nJumlah stock setiap jenis bunga pada cabang ROYAL GARDEN: ");
        int[] stockCabang = hitungStockCabang(stockBunga);
        for (int i = 0; i < stockBunga.length; i++) {
            System.out.println("Stock Bunga " + namaBunga[i] + ": " + stockCabang[i]);
        }
    }
    private static int hitungPendapatanCabang(int[] stockCabang, int[] harga) {
        int totalPendapatan = 0;
        for (int i = 1; i < stockCabang.length; i++) {
            totalPendapatan += stockCabang[i] * harga[i];
        }
        return totalPendapatan;
    }
    private static int[] hitungStockCabang(int[][] stockBunga) {
        int[] totalStock = new int[4];
        for (int i = 0; i < stockBunga.length; i++) {
            for (int j = 0; j < stockBunga[i].length; j++) {
                totalStock[j] += stockBunga[i][j];
            }
        }
        return totalStock;
    }
}

