import java.util.Scanner;

public class DragonMain09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dragon09 dragon = new Dragon09(3, 5);
        
        while (true) {
            System.out.println();
            System.out.println("Move dragon");
            System.out.println("1. Move right 2. Move left 3. Move up 4. Move down 0. Exit");
            System.out.print("Enter number: ");
            int number = sc.nextInt();

            System.out.println();
            switch (number) {
                case 1:
                    dragon.moveRight();
                    break;
                case 2:
                    dragon.moveLeft();
                    break;
                case 3:
                    dragon.moveUp();
                    break;
                case 4:
                    dragon.moveDown();
                    break;
                default:
                System.exit(0);
                    break;
            }
            dragon.printPosition();
        }
    }
}
