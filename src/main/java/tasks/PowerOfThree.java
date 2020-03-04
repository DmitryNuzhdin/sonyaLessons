package tasks;

public class PowerOfThree {
    public static boolean powerOfThree(int a) {
        int c = a;
        if ( a != 0) {
            while (c % 3 == 0) {
                System.out.println(c);
                c = c / 3;
            }

            if (c == 1) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] arg) {
        System.out.println(powerOfThree(0));
    }
}

