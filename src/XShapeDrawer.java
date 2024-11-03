public class XShapeDrawer {

    public void drawXShape(int sideLength) {
        if (sideLength % 2 != 0) {
            System.out.println("Please enter an even number for the side length.");
            return;
        }

        for (int i = 0; i < sideLength; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 1; i <= sideLength / 2; i++) {
            for (int j = 0; j < sideLength; j++) {
                if (j == i || j == (sideLength - i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = sideLength / 2 - 1; i >= 0; i--) {
            for (int j = 0; j < sideLength; j++) {
                if (j == i || j == (sideLength - i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = 0; i < sideLength; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
