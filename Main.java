public class Main {

    public static void printArray(int[] array) {
        boolean first = true;
        for (int element: array) {
            if (first) {
                System.out.print("[");
                first = false;
            } else {
                System.out.print(", ");
            }
            System.out.print(element);
        }
        System.out.print("]\n");
    }

    public static void main(String[] args) {
        NearbyElements sample = new NearbyElements();
        printArray(sample.nearby(0, 2, 2));
        printArray(sample.nearby(1, 0, 1));
        printArray(sample.nearby(1, 3, 5));
    }
}
