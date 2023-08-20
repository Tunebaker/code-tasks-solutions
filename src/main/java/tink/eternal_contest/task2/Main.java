package tink.eternal_contest.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int needParts = scanner.nextInt();
        int cuts = 0;
        int gotParts = 1;
        while(gotParts < needParts){
            gotParts *= 2;
            cuts++;
        }
        System.out.println(cuts);
    }
}
