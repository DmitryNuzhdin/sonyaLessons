import java.net.DatagramSocket;

public class FirstClass {
    public static void main(String[] args) {
//      int - целые значения
        int a = 1;
        if (a == 0) {
            a = 5;
        } else {
            a = 3;
        }
//        System.out.println("Ответ:");
//        System.out.println(a + 1);

//      В промежутке от 0 до 20 (включительно) выдать только те числа, которые делятся на 3
        for (int i=0; i<=20; i++) {
            if (i % 3 == 0) {
//                System.out.println("Ответ:");
//                System.out.println(i);
            }
        }

//      Выдать только простые числа в промежутке от 2 до 100 (включительно)
        for (int b=2; b<=100; b++) {
            boolean p=true;
            for (int c = 2; c < b; c++) {
                if (b % c == 0) {
                    p=false;
                }
            }
            if (p) {
//                System.out.println("Ответ:");
//                System.out.println(b);
            }
        }

    }
}
