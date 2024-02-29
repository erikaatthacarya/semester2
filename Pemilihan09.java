import java.util.Scanner;

public class Pemilihan09 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir Mahasiswa");
        System.out.print("Masukkan Nilai Tugas: ");
        double tugas = input.nextDouble();
        System.out.print("Masukkan Nilai Kuis: ");
        double kuis = input.nextDouble();
        System.out.print("Masukkan Nilai UTS: ");
        double uts = input.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        double uas = input.nextDouble();
        // validasi nilai dalam rentang
        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100) {
            System.out.println("Nilai tidak valid!");
        } else {
            // Hitung nilai akhir berdasarkan bobot
            double nilaAkhir = (tugas * 0.2) + (kuis * 0.2) + (uts * 0.3) + (uas * 0.3);
            // Konversi nilai huruf
            String nilaiHuruf;
            if (nilaAkhir >= 80) {
                nilaiHuruf = "A";
            } else if (nilaAkhir >= 73) {
                nilaiHuruf = "B+";
            } else if (nilaAkhir >= 65) {
                nilaiHuruf = "B";
            } else if (nilaAkhir >= 60) {
                nilaiHuruf = "C+";
            } else if (nilaAkhir >= 50) {
                nilaiHuruf = "C";
            } else if (nilaAkhir >= 39) {
                nilaiHuruf = "D";
            } else {
                nilaiHuruf = "E";
            }
            // Output hasil
            System.out.println("Nilai Akhir: " + nilaAkhir);
            System.out.println("Nilai Huruf: " + nilaiHuruf);

            // Keterangan LULUS/TIDAK LULUS
            if (nilaiHuruf.equals("D") || nilaiHuruf.equals("E")) {
                System.out.println("Keterangan: TIDAK LULUS");
            } else {
                System.out.println("Keterangan: SELAMAT ANDA LULUS");
            }
        }
    }
}

