// Ccылочные типы
public class Lesson2 {
    public static void main(String[] args) {
//        char a ='s';
//        String s = "Hello";
//        String s2 = "Hello1";
//        int i = 1;
//        String s3 = null;
//        System.out.println(Objects.equals(s3, s2));

//        int [] w =new int[5] ;
        int [] q = new int [] {1,2,3,4};
        int [] q2 = q;
        q[0] = 5;
        q[1] = 3;
        q[2] = q[0];
//        for (int i= 0; i< q2.length; i++) {
//            System.out.println(q2[i]);
//        }

        for (int g:q2) {
            System.out.println(g);
        }

//        int a=1;
//        int b=a;
//        a=1+1;
//        System.out.println(b);
    }
}
