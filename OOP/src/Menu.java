package OOP.src;

public class Menu {

	public static void tambahBuah() {
	    while (true) {
	        System.out.println("====Tambah Buah====");
	        String namaBuah = Console.readInputString("Masukkan Nama Buah: ");
	        int hargaBuah = (int) Console.readInputNumber("Masukkan Harga Buah: ");
	        int stokBuah = (int) Console.readInputNumber("Masukkan Stok Buah: ");
	
	        Buah buah = new Buah(namaBuah, hargaBuah, stokBuah);
	        AppBuah.listBuah.add(buah);
	
	        System.out.println("Ulang? (Y/T)");
	        String option = AppBuah.scanner.next();
	        if (option.equalsIgnoreCase("T")) {
	            break;
	        }
	    }
	}

	public static void tampilBuah() {
	    System.out.println("========== LIST BUAH ==========");
	    for (int i = 0; i < AppBuah.listBuah.size(); i++) {
	        System.out.println((i + 1) + ". " + AppBuah.listBuah.get(i).getNamaBuah() + " || " + AppBuah.listBuah.get(i).getHargaBuah()
	                + " || " + AppBuah.listBuah.get(i).getStokBuah() + " pcs");
	    }
	}
  
}