import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int M = 0;
        int Y = 0;

        for(int i=0; i<N; i++) {
            int T = sc.nextInt();

            Y += (T / 30 + 1) * 10;
            M += (T / 60 + 1) * 15;
        }

        if (Y < M) {
            System.out.println("Y " + Y);
        } else if (Y > M) {
            System.out.println("M " + M);
        } else {
            System.out.println("Y M " + Y);
        }
    }
}
