public class FirstClass {
    public static void main(String[] args) {
        int a = 1;
        if (a==0){
            a=5;
        } else {
            a=3;
        }
        for (int i=0; i<=20; i++) {
            if (i % 3 == 0) {
//                System.out.println(i);
            }
        }
        for (int b=2; b<=100; b++) {
            boolean p=true;
            for (int c = 2; c < b; c++) {
                if (b % c == 0) {
                    p=false;
                }
            }
            if (p) {
                System.out.println(b);
            }
        }

//        System.out.println(a+3);
    }
}
