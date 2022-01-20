package exercise.whileloop;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 1;
        int fnMinus1 = 1; //F(n-1), init to F(2)
        int fnMinus2 = 1; //F(N-2) init to F(1)
        int nMax = 20;
        int sum = fnMinus1 + fnMinus2; // Need sum to compute average
        double average;

        System.out.println("The first" + nMax + "Fibonacci numbers are : ");
        while (n <= nMax) {
        System.out.println(fnMinus1 + " ");
        //Compute F(n), print it and add to sum
        //Increment the index n and shift the numbers for the next iteration

        sum = fnMinus1 + fnMinus2;
        fnMinus1 = fnMinus2;
        fnMinus2 = sum;
        ++n;
        }
        average = sum / nMax;
        System.out.println("The average is : " + average);
    }
}
