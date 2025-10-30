import java.util.*;
public class Main {
    static final int N = 1000000;
    static int[][] x = new int[10][N + 1];

    // f(x): repeatedly multiply digits until single-digit
    static int f(int n) {
        if (n < 10) return n;
        int prod = 1;
        while (n > 0) {
            int d = n % 10;
            if (d != 0) prod *= d;
            n /= 10;
        }
        return f(prod);
    }

    static void precompute() {
        // fill x[f(i)][i]++
        for (int i = 1; i <= N; i++) {
            int g = f(i);
            x[g][i]++;
        }

        // prefix sums
        for (int k = 1; k < 10; k++) {
            for (int i = 1; i <= N; i++) {
                x[k][i] += x[k][i - 1];
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        precompute();

        int Q = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        while (Q-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int k = sc.nextInt();
            sb.append(x[k][r] - x[k][l - 1]).append('\n');
        }

        System.out.print(sb);
    }
}
