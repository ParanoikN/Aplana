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
       for(int i = 0; i < Slova.length; i++){
        int d = 0;
        String s = null;
        if (String Slova[i].length > d) ;
        {
            d = Slova[i].length;
            s = new String;
        }
        System.out.print(s);
    }
}