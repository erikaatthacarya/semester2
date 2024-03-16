import java.util.Scanner;

public class MainAkar09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan bilangan yang ingin dihitung akarnya : ");
        double num = sc.nextDouble();
        akar09 akar = new akar09();
        System.out.println("---------------------------------------------------------");
        System.out.println("Hasil akar dengan Brute Force");
        System.out.println("Akar dari " + num + " adalah : " + akar.akar09BF(num));
        System.out.println("---------------------------------------------------------");
        System.out.println("Hasil akar dengan Divide and Conquer");
        System.out.println("Akar dari " + num + " adalah : " + akar.akar09DC(num, 0, num));
        System.out.println("---------------------------------------------------------");
    }
}
