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
                Lekciya3.m1(); //надо переименовать метод. вообще не понятно, что он делает
                break;
            case 2:
                MassivSlovLekciya3.m2();//аналогично 
                break;
            case 3:
                M20L4.massiv();//аналогично. еще и по названию класса тоже не понятно, что там должно происходить. 
                break;
        }
    }
}
