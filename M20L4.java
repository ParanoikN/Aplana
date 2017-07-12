/**
 * Created by Paranoik on 08.07.2017.
 */

//опять-таки, названия классов, методов, переменных нужно более конкретно называть. Чтоб человек, который первый раз код видит
//мог понять логику работы программы. вот M20L4, massiv(), ranomMassiv20L4 ни о чем не говорят) 
public class M20L4 {
    public static void massiv() {
        int[] ranomMassiv20L4 = new int[20];
        
        //поиск элементов и генерацию массва нужно по разным методам разбивать. например:
        //generateArrayOfRandomIntegerNumbers(int arraySize)
        //getIndexOfMaxNegativeElement(int[] numbersArray)
        //getIndexOfMinPositiveElement(int[] numbersArray)
        //и необходимо добавить еще метод, который меняет найденные элементы местами:
        //swapArrayElements(int[] array, int indexOfMax, int indexOfMin)
        
        for (int i = 0; i < ranomMassiv20L4.length; i++) {
            ranomMassiv20L4[i] = ((int) (Math.random() * 20) - 10); //10 не получится
            System.out.println(ranomMassiv20L4[i]);
        }
        int maxNegativ = ranomMassiv20L4[0];
        for (int i = 0; i < ranomMassiv20L4.length; i++) {
            if (ranomMassiv20L4[i] < maxNegativ) {
                maxNegativ = ranomMassiv20L4[i];
            }
        }
        int minPositiv = 11;
        for (int i = 0; i < ranomMassiv20L4.length; i++) {
            if (ranomMassiv20L4[i] >= 0) {
                if (ranomMassiv20L4[i] < minPositiv) {
                    minPositiv = ranomMassiv20L4[i];
                }
            }
        }
        System.out.print("Наименьшее= " + maxNegativ);
        System.out.print(" Наибольшее= " + minPositiv);
    }
}
