package CicilanKalkulator.src;


public class App {

    public static void main(String[] args) throws Exception {
            int hargaAwal = (int) Console.readInputNumber("Harga Awal: ", 1_000_000, 100_000_000);
            int durasiCicilan = (int) Console.readInputNumber("Durasi Cicilan: ", 1);
            int bunga = (int) Console.readInputNumber("Bunga: ", 0);

            Cicilan cicil = new Cicilan(hargaAwal, durasiCicilan, bunga);
            TampilBayar report = new TampilBayar(cicil);

            report.tampilBayaran();
            report.tampilSisaBayaranPerBulan(hargaAwal, durasiCicilan, bunga);
    }
}
