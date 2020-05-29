package CicilanKalkulator.src;

public class Cicilan {
    private int hargaAwal;
    private int durasiCicilan;
    private double bunga;
    static final int PERCENT = 100;
    static final int BULAN_DALAM_TAHUN = 12;

    public Cicilan(int hargaAwal, int durasiCicilan, double bunga) {
        setHargaAwal(hargaAwal);
        setDurasiCicilan(durasiCicilan);
        setBunga(bunga);
    }

    public int getHargaAwal() {
        return hargaAwal;
    }

    public void setHargaAwal(int hargaAwal) {
        if (hargaAwal >= 1_000_000 && hargaAwal <= 100_000_000) {
            this.hargaAwal = hargaAwal;
        } else {
            throw new IllegalArgumentException("Harga minimal 1.000.000");
        }
        
    }

    public int getDurasiCicilan() {
        return durasiCicilan;
    }

    public void setDurasiCicilan(int durasiCicilan) {
        if (durasiCicilan >= 1) {
            this.durasiCicilan = durasiCicilan;
        } else {
            throw new IllegalArgumentException("Durasi cicilan minimal 1");
        }
    }

    public double getBunga() {
        return bunga;
    }

    public void setBunga(double bunga) {
        if (bunga >= 0) {
            this.bunga = bunga;
        } else {
            throw new IllegalArgumentException("Bunga cicilan minimal 0");
        }
        
    }

    public static double hitungBayaranPerBulan(int hargaAwal, int durasiCicilan, double bunga) {
        Cicilan cicil = new Cicilan(hargaAwal, durasiCicilan, bunga);
        return (cicil.hargaAwal + (cicil.hargaAwal * (cicil.bunga / PERCENT)))
                / (cicil.durasiCicilan * BULAN_DALAM_TAHUN);
    }

    public static void hitungSisaBayaranPerBulan(int hargaAwal, int durasiCicilan, double bunga,
            double bayaranPerBulan) {
        Cicilan cicil = new Cicilan(hargaAwal, durasiCicilan, bunga);
        System.out.println("---------- SISA BAYARAN PER BULAN ----------");
        double sisaBayaran = cicil.hargaAwal + (cicil.hargaAwal * (cicil.bunga / PERCENT));
        for (int i = 0; i < cicil.durasiCicilan * BULAN_DALAM_TAHUN; i++) {
            sisaBayaran -= bayaranPerBulan;
            Formatter.formatHarga(sisaBayaran);
        }
    }

}