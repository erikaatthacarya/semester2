import java.util.Scanner;

public class MainPangkat09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====================================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();

        pangkat09[] png = new pangkat09[elemen];

        for (int i = 0; i < elemen; i++) {
            png[i] = new pangkat09(i, i);
            System.out.print("Masukkan nilai yang akan dipangkatkan ke-" + (i + 1) + " : ");
            png[i].nilai = sc.nextInt();
            System.out.print("Masukkan nilai pemangkat ke-" + (i + 1) + " : ");
            png[i].pangkat = sc.nextInt();
        }

        System.out.println("====================================================");
        System.out.println("1. Brute Force\n2. Divide and Conquer");
        System.out.println("====================================================");
        System.out.println("Pilih metode yang anda inginkan : ");
        int metode = sc.nextInt();
        switch (metode) {
            case 1:
                System.out.println("====================================================");
                System.out.println("Hasil pangkat dengan Brute Force");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah : "+png[i].pangkat09BF(png[i].nilai,png[i].pangkat));
            }
                break;
            case 2:
                System.out.println("============================================");
                System.out.println("Hasil pangkat dengan Divide and Conquer");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah : "+png[i].pangkat09DC(png[i].nilai,png[i].pangkat));
            }
                break;
        }
        System.out.println("====================================================");
    }
}
