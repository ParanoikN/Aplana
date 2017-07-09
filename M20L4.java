/**
 * Created by Paranoik on 08.07.2017.
 */
public class M20L4 {
    public static void m4(String[] args) {
        int[] ranomMassiv20L4 = new int[20];
        for (int i = 0; i < ranomMassiv20L4.length; i++) {
            ranomMassiv20L4[i] = ((int) (Math.random() * 20) - 10);
            System.out.println(ranomMassiv20L4[i]);
        }
        int maxNegativ = ranomMassiv20L4[0];
        for (int i = 0; i < ranomMassiv20L4.length; i++) {
            if (ranomMassiv20L4[i] < maxNegativ) {
                maxNegativ = ranomMassiv20L4[i];
            }
        }
        int minPositiv = 0;
        for (int i = 0; i < ranomMassiv20L4.length; i++) {
            if (ranomMassiv20L4[i] >= 0) {
                minPositiv = ranomMassiv20L4[i];
            }
        }
        System.out.print("Наименьшее= " + maxNegativ);
        System.out.print(" Наибольшее= " + minPositiv);
    }
}