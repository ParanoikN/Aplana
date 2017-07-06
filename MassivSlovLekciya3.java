import java.util.Scanner;

/**
 * Created by Tratyakov Nikita on 28.06.2017.
 * Задача из лекции 3 про массивы
 */
public class MassivSlovLekciya3 {
    public static void main(String[] args) {
        System.out.print("Задайте размер массива: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String[] Slova = new String[a];
        int i = 0;
        for (String element : Slova) {
            System.out.print("Введите " + (i + 1) + "-й элемент массива: ");
            Slova[i] = scanner.next();
            i++;
        }
        int etalon = 0;
        String s = new String();
        for (int y = 0; y < Slova.length; y++) {
            int d = Slova[y].length();
            if (d > etalon) ;
            {
                etalon = d;
                s = Slova[y];
            }
        }
        System.out.print(s);
    }
}