import java.util.Scanner;

/**
 * Created by Nikita Tretyakov on 24.06.2017.
 * @author Nikita Tretyakov
 */
public class Base {
    public static void main(String[] args) {
        System.out.println("Калькулятор");
        System.out.println("Введите первое число");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        System.out.println("Введите второе число");
        double b = scanner.nextDouble();
        //double c = a + b;
        System.out.print("Сумма:");
        System.out.printf("%.4f", a+b);
        scanner.close();
    }
}
