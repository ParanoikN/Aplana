/**
 * Created by Paranoik on 08.07.2017.
 */
public class M20L4 {
    public static void main(String[] args) {
        int[] M = new int[20];
        for (int i = 0; i < M.length; i++) {
            M[i] = ((int) (Math.random() * 20) - 10);
            System.out.println(M[i]);
        }
        int min = M[0];
        for (int i = 0; i < M.length; i++) {
            if (M[i] < min) {
                min = M[i];
            }
        }
        int max = M[0];
        for (int i = 0; i < M.length; i++) {
            if (M[i] > max) {
                max = M[i];
            }
        }
        System.out.print("Наименьшее= " + min);
        System.out.print(" Наибольшее= " + max);
    }
}