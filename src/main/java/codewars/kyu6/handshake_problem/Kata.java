package codewars.kyu6.handshake_problem;

import java.util.stream.IntStream;

public class Kata {
    public static int GetParticipants(int handshakes) {
        int participant = 5;
        int maxShakes = 0;
        maxShakes = IntStream.range(1, participant).sum();
        System.out.printf("for %d participant maxShakes is %d \n", participant, maxShakes);
        return 0; //TODO
    }
}
