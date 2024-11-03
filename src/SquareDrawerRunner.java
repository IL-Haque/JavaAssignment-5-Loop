import java.util.Scanner;

public class SquareDrawerRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the side length of the squares: ");
        int sideLength = scanner.nextInt();

        SquareDrawer drawer = new SquareDrawer();

        drawer.drawSquares(sideLength);

        scanner.close();
    }
}
