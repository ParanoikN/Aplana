import java.util.Scanner;

/**
 * Created by Paranoik on 05.07.2017.
 */
public class ZapuskLekciya3 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Выберете вводом: 1 - калькулятор, 2 - массив");
        int n = scan.nextInt();
        if (n==1) {
            Lekciya3 main = new Lekciya3();
        }
        if (n==2) {
            System.out.println("= 2");
        }

    }
}