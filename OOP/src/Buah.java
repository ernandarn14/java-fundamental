package OOP.src;

public class Buah {
    public String namaBuah;
    public int hargaBuah;
    public int stokBuah;

    public Buah (String namaBuah, int hargaBuah, int stokBuah){
        setNamaBuah(namaBuah);
        setHargaBuah(hargaBuah);
        setStokBuah(stokBuah);
    }

    public String getNamaBuah() {
        return namaBuah;
    }

    public void setNamaBuah(String namaBuah) {
        if (namaBuah.length() == 0){
            throw new IllegalArgumentException("Nama buah tidak boleh kosong");
        }
        this.namaBuah = namaBuah;
    }

    public int getHargaBuah() {
        return hargaBuah;
    }

    public void setHargaBuah(int hargaBuah) {
        if (hargaBuah <= 0){
            throw new IllegalArgumentException("Harga buah tidak boleh kosong");
        }
        this.hargaBuah = hargaBuah;
    }

    public int getStokBuah() {
        return stokBuah;
    }

    public void setStokBuah(int stokBuah) {
        if (stokBuah < 0 ){
            throw new IllegalArgumentException("Stok tidak boleh dibawah 0");
        }
        this.stokBuah = stokBuah;
    }

    
}