import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int width = 2;
        int length = 5;
        if (width >= length) {
            System.out.println("" + width + " м это квадрат  " + length + "m");
        } else if (width <= length) {
            System.out.println("" + width + " м это прямоугольник " + length + "m");
        }
        int sum = 5000;
        if (sum <= 4999) {
            System.out.println("" + sum + "Сумма без скидкии");
        } else if (sum >= 5000) {

            int result = -10;

            {
                System.out.println("" + sum + "Сумма со скидкой 10% = " + (sum / result));

            }
        }
        int grade = 100;
        if (grade >= 0 && grade < 25) {
            System.out.println("Ниже 25 - F");
        } else if (grade >= 25 && grade < 45) {
            System.out.println("От 25 до 45 - E");
        } else if (grade >= 45 && grade < 50) {
            System.out.println("От 45 до 50 - D");
        } else if (grade >= 50 && grade < 60) {
            System.out.println("От 50 до 60 - C");
        } else if (grade >= 60 && grade < 80) {
            System.out.println("От 60 до 80 - B");
        } else if (grade >= 80 && grade < 100) {
            System.out.println("Выше 80 - A");
        } else {
            System.out.println("Неверное значение");

        }
        int a = 12345;
        String aS = String.valueOf(a);

        char[] b = aS.toCharArray();
        String q = "";
        for (int i = 0; b.length > i; i++) {
            System.out.println(b[i]);
            q = b[i] + q;
        }
        System.out.println(q);

        int[][] a1 = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf(" * ", a1[i][j]);
            }
            System.out.println("");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Бонусы зависомисто от класса");
        double skills = scanner.nextDouble();
        switch ((int) skills) {
            case 50:
                System.out.println("Класс A:50%");
                break;
            case 25:
                System.out.println("Класс Б:25%");
                break;
            case 0:
                System.out.println("Класс С :0%");
                break;
            default:
                System.out.println("Значение не верно");


        }

    }

}







