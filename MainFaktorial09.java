import java.util.Date;
import java.util.Scanner;

public class MainFaktorial09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===============================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();
        faktorial09[] fk = new faktorial09[elemen];
        for (int i = 0; i < elemen; i++) {
            fk[i] = new faktorial09();
            System.out.print("Masukkan nilai data ke-" + (i + 1) + " : ");
            fk[i].nilai = sc.nextInt();
        }
        System.out.println("===============================================");
        System.out.println("Hasil Faktorial dengan Bruce Force");
        for (int i = 0; i < elemen; i++) {
            long startTime = new Date().getTime();
            long endTime = new Date().getTime();
            System.out.println("Faktorial dari nilai " + fk[i].nilai + "adalah : " + fk[i].faktorial09BF(fk[i].nilai));
            System.out.println("Waktu eksekusi: " + (endTime - startTime) + " ms");
        }
        System.out.println("===============================================");
        System.out.println("Hasil Faktorial dengan Divide and Conquer");
        for (int i = 0; i < elemen; i++) {
            long startTime = new Date().getTime();
            long endTime = new Date().getTime();
            System.out.println("Faktorial dari nilai " + fk[i].nilai + "adalah : " + fk[i].faktorial09DC(fk[i].nilai));
            System.out.println("Waktu eksekusi: " + (endTime - startTime) + " ms");
        }
        System.out.println("===============================================");
    }
}
