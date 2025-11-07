public class CalcPi {
    public static void main(String[] args) {

        int terms = Integer.parseInt(args[0]);
        double sum = 0.0;

        for (int i = 0; i < terms; i++) {
            double denominator = (2.0 * i) + 1.0;

            if (i % 2 == 0) {
                sum += 1.0 / denominator;
            } else {
                sum -= 1.0 / denominator;
            }
        }

        double piApprox = 4 * sum;

        System.out.println("pi according to Java: " + Math.PI);
        System.out.printf("pi, approximated: " + piApprox); // <-- EXACT SPACING
    }
}
