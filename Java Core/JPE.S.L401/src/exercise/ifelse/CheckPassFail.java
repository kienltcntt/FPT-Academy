package exercise.ifelse;

import java.util.Scanner;

public class CheckPassFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value : ");
        int mark = sc.nextInt();

        if(mark >= 50) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        System.out.println("CHECK DONE");
    }
}
