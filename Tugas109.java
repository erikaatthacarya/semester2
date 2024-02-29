import java.util.Scanner;

public class Tugas109 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //deklarasi array kode plat mobil & nama kota
        char KODE[] = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        String KOTA[]= {
            "BANTEN",
            "JAKARTA",
            "BANDUNG",
            "CIREBON",
            "BOGOR",
            "PEKALONGAN",
            "SEMARANG",
            "SURABAYA",
            "MALANG",
            "TEGAL",
        };
        System.out.print("Masukkan kode plat nomor: ");
        String kodePlat = sc.nextLine();

        //mencari indeks kode plat dalam array KODE 
        int i = 0;
        boolean found = false;
        while (i < KODE.length && !found) {
            if (kodePlat.charAt(0) == KODE[i]) {
                found = true;
            } else {
                i++;
            }
        }
        //menampilkan nama kota jika kode plat ditemukan
        if (found) {
            System.out.println("Kota: " + KOTA[i]);
        } else {
            System.out.println("Kode plat tidak ditemukan!");
        }
    }
}
