package tasks;

public class GreatestCommonDivisor {
    public static int gcd(int a, int b) {

        for (int c = b; c >= 2; c--) {
            if (b % c == 0 && a % c == 0) {
                return c;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(gcd(14, 14));
    }
}
