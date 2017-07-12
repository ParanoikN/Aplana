import java.util.Scanner;

/**
 * Created by Nikita Tretyakov on 28.06.2017.
 * Калькулятор из лекции 3
 */

//классы желательно не по названию лекций называть, а по функциональности
public class Lekciya3 {
    //метод переименовать
    public static void m1() {
        System.out.println("Калькулятор полная версия");
        System.out.println("Введите первое число");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        System.out.println("Введите операцию");
        String c = scanner.next();
        System.out.println("Введите второе число");
        double b = scanner.nextDouble();
        
        //желательно писать наоборот "*".equals(с)
        //иначе если с=null, у тебя NullPointerException будет и на этот работа программы закончится
        if (c.equals("*")){
            System.out.println("= " + (a * b));
        }
        if (c.equals("/")){
            System.out.println("= " + (a / b)); //а если b = 0?
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
