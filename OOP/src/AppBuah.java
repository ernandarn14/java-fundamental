package OOP.src;

import java.util.ArrayList;
import java.util.Scanner;

public class AppBuah {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Buah> listBuah = new ArrayList<Buah>();

    public static void main(String[] args) throws Exception {
        while (true) {
            System.out.println("Menu App Buah:");
            System.out.println("1. Tambah Buah");
            System.out.println("2. List Buah");
            System.out.println("3. Keluar");
            System.out.print("Masukkan Inputan Anda: ");
            int input = scanner.nextInt();
            scanner.nextLine();

            switch (input) {
                case 1: {
                    Menu.tambahBuah();
                }
                case 2: {
                    Menu.tampilBuah();
                }
                case 3: {
                    break;
                }
            }
        }
    }
}