package ex2;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            list.add(sc.nextInt());
        }

        list.add(sc.nextInt(), sc.nextInt());

        while (list.peek() != null) {
            System.out.print(list.pop() + " ");
        }
    }

}