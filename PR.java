import java.util.Scanner;

public class PR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Nama: ");
        String inputName = scanner.nextLine();
    
        System.out.print("Input Umur: ");
        byte inputAge = scanner.nextByte();
        scanner.nextLine();
    
        System.out.print("Input Tempat Tinggal: ");
        String inputAddress = scanner.nextLine();
    
        System.out.print("Input Tahun Lahir: ");
        int inputYear = scanner.nextInt();
        scanner.nextLine();

        String template = "Nama anda adalah %s, berumur %s tahun, tinggal di %s, lahir tahun %s";
        String result = String.format(template, inputName, inputAge, inputAddress, inputYear);

        System.out.println(result);
    }
}