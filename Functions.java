import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Functions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Nilai Minimum: ");
        byte inputMin = scanner.nextByte();
        // System.out.print("Input Nilai Maximum: ");
        // byte inputMax = scanner.nextByte();

        int angka[] = { 1, 2, 3, 4 };
        System.out.println(includes(angka, inputMin));

        // arrayFromRange(inputMin, inputMax)
        // System.out.println(arrayFromRange(inputMin, inputMax));

        // int range = (inputMax - inputMin) + 1;

        // ===with array==
        // int bil[] = new int[range];

        // for (int i = 0; i < range; i++){
        // bil[i] = i + inputMin;
        // }

        // System.out.println(Arrays.toString(bil));

        // == with arrayList
        // ArrayList<Integer> bil = new ArrayList<Integer>();
        // for (int i = inputMin; i <= inputMax; i++) {
        // bil.add(i);
        // }

        // System.out.println((bil));
    }

    public static ArrayList<Integer> arrayFromRange(int inputMin, int inputMax) {
        if (inputMin < inputMax) {
            ArrayList<Integer> bil = new ArrayList<Integer>();
            for (int i = inputMin; i <= inputMax; i++) {
                bil.add(i);
            }
            // System.out.println((bil));
            return bil;
        }

        return new ArrayList<Integer>();
    }

    public static boolean includes(int bil[], int angka) {
        boolean result = false;

        for (int i = 0; i < bil.length; i++) {
            if (bil[i] == angka)
                return true;
        }

        return result;
    }
}