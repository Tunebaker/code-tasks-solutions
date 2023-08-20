package codewars.kyu6.handshake_problem;

public class Kata {
    public static int GetParticipants(int handshakes) {
        int participant = 5;
        int maxShakes = 0;
        for (int i = participant; i > 0; i--) {
            maxShakes += i - 1;
        }
        System.out.printf("for %d participant maxShakes is %d \n", participant, maxShakes);
        return 0; //TODO
    }
}
