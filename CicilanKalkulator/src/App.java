package CicilanKalkulator.src;

import java.util.Scanner;
// import java.util.Locale;

public class App {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        while (true) {
            int hargaAwal = (int) Console.readInputNumber("Harga Awal: ");
            int durasiCicilan = (int) Console.readInputNumber("Durasi Cicilan: ");
            int bunga = (int) Console.readInputNumber("Bunga: ");

            double bayaranPerBulan = Cicilan.hitungBayaranPerBulan(hargaAwal, durasiCicilan, bunga);
            TampilBayar.tampilBayaran(bayaranPerBulan);
            Cicilan.hitungSisaBayaranPerBulan(hargaAwal, durasiCicilan, bunga, bayaranPerBulan);

            System.out.println("Ulang? (Y/T)");
            String option = scanner.next();
            if (option.equalsIgnoreCase("T")) {
                break;
            }
        }
    }
}
