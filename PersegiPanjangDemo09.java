import java.util.Scanner;

public class PersegiPanjangDemo09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length;
        System.out.print("MASUKKAN BERAPA BANYAK ANDA INGIN MENGHITUNG: ");
        length = sc.nextInt();

        PersegiPanjang09[] arrayOfPersegiPanjang09 = new PersegiPanjang09[length];
        int panjang, lebar;

        for (int i = 0; i < arrayOfPersegiPanjang09.length; i++) {
            System.out.println("Persegi panjang ke-" + (i + 1));
            System.out.print("Masukkan panjang: ");
            panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            lebar = sc.nextInt();

            arrayOfPersegiPanjang09[i] = new PersegiPanjang09(panjang, lebar);
        }
        PersegiPanjang09 persegiPanjang09 = new PersegiPanjang09();
        persegiPanjang09.cetakInfo(arrayOfPersegiPanjang09);

        // for (int i = 0; i < 3; i++) {
        //     System.out.println("Persegi panjang ke-" + (i + 1)+ ", panjang: " + arrayOfPersegiPanjang09[i].panjang + ", lebar: " + arrayOfPersegiPanjang09[i].lebar);
        // }

        // arrayOfPersegiPanjang09[0] = new PersegiPanjang09();
        // arrayOfPersegiPanjang09[0].panjang = 110;
        // arrayOfPersegiPanjang09[0].lebar = 30;
        // System.out.println("Persegi panjang ke-1, panjang: " + arrayOfPersegiPanjang09[0].panjang + ", lebar: "
        //         + arrayOfPersegiPanjang09[0].lebar);

        // arrayOfPersegiPanjang09[1] = new PersegiPanjang09();
        // arrayOfPersegiPanjang09[1].panjang = 80;
        // arrayOfPersegiPanjang09[1].lebar = 40;
        // System.out.println("Persegi panjang ke-2, panjang: " + arrayOfPersegiPanjang09[1].panjang + ", lebar: "
        //         + arrayOfPersegiPanjang09[1].lebar);

        // arrayOfPersegiPanjang09[2] = new PersegiPanjang09();
        // arrayOfPersegiPanjang09[2].panjang = 100;
        // arrayOfPersegiPanjang09[2].lebar = 20;
        // System.out.println("Persegi panjang ke-3, panjang: " + arrayOfPersegiPanjang09[2].panjang + ", lebar: "
        //         + arrayOfPersegiPanjang09[2].lebar);

    }
}
