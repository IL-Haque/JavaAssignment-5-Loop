import java.util.Scanner;

public class MinimumFinder {
    private Double minimum = null;  // Stores the minimum value

    public void processValue(double value) {
        if (minimum == null) {
            minimum = value;
        } else if (value < minimum) {
            minimum = value;
        }
    }

    public Double getMinimum() {
        return minimum;
    }
}