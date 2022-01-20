package exercise.forloop;

public class AverageArray {
    public static void main(String[] args) {
        int[] array = {12, 5, 9, 8, 11, 86};
        double average;
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        average = sum / array.length;
        System.out.println("Average of all element in array: " + average);
    }
}
