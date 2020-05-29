package CicilanKalkulator.src;

import java.text.NumberFormat;

public class Formatter {
    public static void formatHarga(double harga) {
        System.out.println(NumberFormat.getCurrencyInstance().format(harga));
    }
}