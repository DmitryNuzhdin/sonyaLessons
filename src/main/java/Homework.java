import java.sql.SQLOutput;

public class Homework {
    public static void main(String[] args) {
// Дано: поле из точек (двухмерное), по одной координате от 0 до 10, и по другой координате от 0 до 10;
// Что нужно сделать: для каждой точки (x;y) вывести расстояние от начала координат до этой точки.
        int a = 2;
        for (int x = 0; x<=10; x++ ) {
            for (int y = 0; y<=10; y++) {
                System.out.println("Расстояние от НК:" + Math.sqrt(Math.pow(x,a) + Math.pow(y,a)));
            }
        }
    }
}
