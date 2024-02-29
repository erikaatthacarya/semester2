import java.util.Scanner;

public class Tugas209 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pilihan;
        double Jarak,Waktu,Kecepatan;

        //menampilkan menu 
        System.out.println("====================Pilih rumus yang ingin dihitung===================");
        System.out.println("|1. Kecepatan                                                        |");
        System.out.println("|2. Jarak                                                            |");
        System.out.println("|3. Waktu                                                            |");
        System.out.println("|0. Keluar                                                           |");
        System.out.print("|Pilihan:                                                              |");
        pilihan = sc.nextInt();

        //menampilkan menu 
        switch (pilihan) {
            case 1:
                //menghitung kecepatan 
                System.out.print("Masukkan jarak (km): ");
                Jarak = sc.nextDouble();
                System.out.print("Masukkan waktu (jam): ");
                Waktu = sc.nextDouble();
                Kecepatan = Jarak / Waktu;
                System.out.println("Kecepatan: " + Kecepatan + "km/jam");
                break;

            case 2: 
                //menghitung jarak
                System.out.print("Masukkan kecepatan (km/jam): ");
                Kecepatan = sc.nextDouble();
                System.out.print("Masukkan waktu (jam): ");
                Waktu = sc.nextDouble();
                Jarak = Kecepatan * Waktu;
                System.out.println("Jarak: " + Jarak + " km");
                break;

            case 3:
                //menghitung waktu
                System.out.print("Maasukkan kecepatan (km/jam): ");
                Kecepatan = sc.nextDouble();
                System.out.print("Masukkan jarak (km): ");
                Jarak = sc.nextDouble();
                Waktu = Jarak / Kecepatan;
                System.out.print("Waktu: " + Waktu + " jam");
                break;

            case 0:
                System.out.println("Terima kasih!");
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }
    }
}
