import java.util.Scanner;

public class Perulangan09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan NIM: ");
        long nim = sc.nextLong();

        //jika n < 10, tambahkan 10
        long n = nim % 100;
        if (n < 10) {
            n += 10;
        }
        System.out.print("n : " + n);
        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;
            } else if (i % 2 == 1) {
                System.out.print("* ");
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
