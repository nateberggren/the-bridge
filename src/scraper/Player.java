package scraper;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// Test case scraper code
class Player {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int M = in.nextInt(); // the amount of motorbikes to control
        System.err.println(M);
        int V = in.nextInt(); // the minimum amount of motorbikes that must survive
        System.err.println(V);
        String L0 = in.next(); // L0 to L3 are lanes of the road. A dot character . represents a safe space, a zero 0 represents a hole in the road.
        System.err.println(L0);
        String L1 = in.next();
        System.err.println(L1);
        String L2 = in.next();
        System.err.println(L2);
        String L3 = in.next();
        System.err.println(L3);



        List<String> moves = Arrays.asList("DOWN", "WAIT", "UP", "UP", "WAIT", "DOWN", "SPEED", "SPEED");
        int idx = 0;
        // game loop
        while (true) {
            int S = in.nextInt(); // the motorbikes' speed
            System.err.println(S);
            for (int i = 0; i < M; i++) {
                int X = in.nextInt(); // x coordinate of the motorbike
                int Y = in.nextInt(); // y coordinate of the motorbike
                int A = in.nextInt(); // indicates whether the motorbike is activated "1" or destroyed "0"
                System.err.printf("%d %d %d\n", X, Y, A);
            }

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");


            // A single line containing one of 6 keywords: SPEED, SLOW, JUMP, WAIT, UP, DOWN.
            System.out.println(moves.get(idx));
            idx++;
        }
    }
}
