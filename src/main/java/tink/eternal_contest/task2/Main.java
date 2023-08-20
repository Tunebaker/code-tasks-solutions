package tink.eternal_contest.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int parts = scanner.nextInt();
        int cuts = (int) Math.ceil(Math.log(parts)/Math.log(2));
        System.out.println(cuts);
    }
}
