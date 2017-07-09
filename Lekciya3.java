import java.util.Scanner;

/**
 * Created by Nikita Tretyakov on 28.06.2017.
 * Калькулятор из лекции 3
 */
public class Lekciya3 {
    public static void m1() {
        System.out.println("Калькулятор полная версия");
        System.out.println("Введите первое число");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        System.out.println("Введите операцию");
        String c = scanner.next();
        System.out.println("Введите второе число");
        double b = scanner.nextDouble();
        if (c.equals("*")){
            System.out.println("= " + (a * b));
        }
        if (c.equals("/")){
            System.out.println("= " + (a / b));
        }
        if (c.equals("+")){
            System.out.println("= " + (a + b));
        }
        if (c.equals("-")){
            System.out.println("= " + (a - b));
        }
        scanner.close();
    }
}
