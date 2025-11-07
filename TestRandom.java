public class TestRandom {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        int greaterThan = 0;
        int lessOrEqual = 0;

        for (int i = 0; i < n; i++) {
            double r = Math.random();
            if (r > 0.5) {
                greaterThan++;
            } else {
                lessOrEqual++;
            }
        }

        System.out.println("> 0.5: " + greaterThan + " times");
        System.out.println("<= 0.5: " + lessOrEqual + " times");

        if (lessOrEqual == 0 || greaterThan == 0) {
            // edge case - avoid division by zero
            return;
        }

        double ratio = (double) greaterThan / lessOrEqual;
        System.out.println("Ratio: " + ratio);
    }
}
