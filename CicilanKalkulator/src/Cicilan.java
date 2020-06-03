package CicilanKalkulator.src;

public class Cicilan {
    private int hargaAwal;
    private int durasiCicilan;
    private double bunga;
    static final int PERCENT = 100;
    static final int BULAN_DALAM_TAHUN = 12;

    public Cicilan(int hargaAwal, int durasiCicilan, double bunga) {
        this.hargaAwal = hargaAwal;
        this.durasiCicilan = durasiCicilan;
        this.bunga = bunga;
    }

    public double hitungBayaranPerBulan() {
        return (hargaAwal + (hargaAwal * (bunga / PERCENT))) / (durasiCicilan * BULAN_DALAM_TAHUN);
    }

    public double hitungSisaBayaranPerBulan(int bulanSudahDibayar) {
        double totalBayar = hargaAwal + (hargaAwal * (bunga / PERCENT));
        double sudahDibayar = hitungBayaranPerBulan() * bulanSudahDibayar;

        return totalBayar - sudahDibayar;
    }

    public int getDurasiCicilan(){
        return this.durasiCicilan;
    }

}