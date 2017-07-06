import java.util.Scanner;

/**
 * Created by Nikita Tretyakov on 05.07.2017.
 */

public class Base {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Выберете вводом: 1 - калькулятор, 2 - массив");
        int n = scan.nextInt();
        switch (n) {
            case 1:
               Lekciya3.main(String[])
                break;
            case 2:
                MassivSlovLekciya3.main(String[])
                break;
        }
    }
    }