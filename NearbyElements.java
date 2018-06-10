public class NearbyElements {

    private int[][] multi = new int[][]{
        { 2, 0, 4, 1241, 12, 5, 11, 1110, -42, 424, 1, 12323 },
        { 1, 3, 5, 7 },
        { 321, 320, 32, 3, 41241, -11, -12, -13, -66, -688 }
    };

    public int[] nearby(int x, int y, int range) {
        int[] row = multi[x];
        int lastIndex = row.length - 1;

        int numberOfElements = 0;

        // Left side: calculating the number of elements, and the first one
        int firstElement;
        if (range < y) {
          numberOfElements += range;
          firstElement = y - range;
        } else {
          numberOfElements += y;
          firstElement = 0;
        }

        // Right side: calculating the number of elements, and the last one
        int lastElement;
        if ((y + range) <= lastIndex) {
          numberOfElements += range;
          lastElement = y + range;
        } else {
          numberOfElements += lastIndex - y;
          lastElement = lastIndex;
        }

        int[] result = new int[numberOfElements];
        int resultPos = 0;

        // Putting in the left side
        for (int i = firstElement; i < y; i++) {
            result[resultPos++] = row[i];
        }

        // Putting in the right side
        for (int i = y + 1; i <= lastElement; i++) {
          result[resultPos++] = row[i];
        }

        return result;
    }
}
