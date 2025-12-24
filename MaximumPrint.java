import java.util.Arrays;
public class MaximumPrint {
    public static <T extends Comparable<T>> T testMaximum(T... values) {
        Arrays.sort(values);
        T max = values[values.length - 1];
        printMax(max);
        return max;
    }
    public static <T> void printMax(T max) {
        System.out.println("Maximum value: " + max);
    }
    public static void main(String[] args) {
        testMaximum(10, 20, 30, 40);
        testMaximum(2.2f, 3.3f, 1.1f);
        testMaximum("Apple", "Banana", "Peach");
    }
}