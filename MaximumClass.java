public class MaximumClass<T extends Comparable<T>> {
    private T a;
    private T b;
    private T c;

    public MaximumClass(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public T testMaximum() {
        return MaximumGeneric.testMaximum(a, b, c);
    }
    public static void main(String[] args) {
        MaximumClass<Integer> intTest =
                new MaximumClass<>(10, 20, 30);
        System.out.println(intTest.testMaximum());

        MaximumClass<Float> floatTest =
                new MaximumClass<>(1.1f, 2.2f, 3.3f);
        System.out.println(floatTest.testMaximum());

        MaximumClass<String> stringTest =
                new MaximumClass<>("Apple", "Banana", "Peach");
        System.out.println(stringTest.testMaximum());
    }
}