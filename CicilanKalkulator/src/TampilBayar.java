package CicilanKalkulator.src;

public class TampilBayar {

	private Cicilan cicil;

	public TampilBayar(Cicilan cicil){
		this.cicil = cicil;
	}

	public void tampilBayaran() {
	    System.out.println("---------- PEMBAYARAN SETIAP BULAN ----------");
		Formatter.formatHarga(cicil.hitungBayaranPerBulan());
	}

	public void tampilSisaBayaranPerBulan(int hargaAwal, int durasiCicilan, double bunga) {
		System.out.println("---------- SISA BAYARAN PER BULAN ----------");
        for (int bulan = 1; bulan <= durasiCicilan * Cicilan.BULAN_DALAM_TAHUN; bulan++) {
			Formatter.formatHarga(cicil.hitungSisaBayaranPerBulan(bulan));
        }
    }
    
}