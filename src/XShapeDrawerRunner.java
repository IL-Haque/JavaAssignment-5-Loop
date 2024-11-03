import java.util.Scanner;

public class XShapeDrawerRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the side length of the box (even number): ");
        int sideLength = scanner.nextInt();

        XShapeDrawer drawer = new XShapeDrawer();

        drawer.drawXShape(sideLength);

        scanner.close();
    }
}
