package exercise.forloop;

public class HarmonicSum {
    public static void main(String[] args) {
        int n = 50000;
        double sumL2R = printLeftToRightSum(n);
        double sumR2L = printRightToLeftSum(n);
        System.out.println("Difference : " + (sumL2R - sumR2L));
        System.out.println();

    }

    private static double printLeftToRightSum(int n) {
        double sum = 0.0;
        for(int i = 0; i <= n; i++) {
            sum += (double) 1 / i;
        }
        System.out.println(sum);
        return sum;
    }

    private static double printRightToLeftSum(int n) {
        double sum = 0.0;
        for(int i = 0; i >= 1; i--) {
            sum += (double) 1 / i;
        }
        System.out.println(sum);
        return sum;

    }
}
