import java.util.Scanner;

/**
 * Created by Nikita Tretyakov on 05.07.2017.
 */

public class Base {
    public static void main(String args[]) {
        Lekciya3 myClass1 = new Lekciya3();
        MassivSlovLekciya3 myClass2 = new MassivSlovLekciya3();
        Scanner scan = new Scanner(System.in);
        System.out.println("Выберете вводом: 1 - калькулятор, 2 - массив");
        int n = scan.nextInt();
        switch (n) {
            case 1:
                myClass1.m1(); // Ругается на эти строчки не могу понять почему
                break;
            case 2:
                myClass2.m2();  // Ругается на эти строчки не могу понять почему
                break;
        }
    }
}
