package exercise.forloop;

public class SumAverageRunningInt {
    public static void main(String[] args) {
        int sum = 0;
        int lowerBound = 1;
        int upperBound = 100;
        for(int i = lowerBound; i <= upperBound; ++i) {
            sum += i;
        }
        System.out.println("Sum of 100 first number is : " + sum);
    }
}
