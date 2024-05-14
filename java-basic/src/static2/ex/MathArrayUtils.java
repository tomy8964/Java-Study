package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils() {
    }

    public static int sum(int[] values) {
        int sum = 0;
        for (int v : values) {
            sum += v;
        }
        return sum;
    }

    public static double average(int[] values) {
        return (double) sum(values) / values.length;
    }

    public static int min(int[] values) {
        int min = values[0];
        for (int v : values) {
            if (v < min) min = v;
        }
        return min;
    }

    public static int max(int[] values) {
        int max = values[0];
        for (int v : values) {
            if (v > max) max = v;
        }
        return max;
    }
}
