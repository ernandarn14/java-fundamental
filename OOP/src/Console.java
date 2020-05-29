package OOP.src;

public class Console {

	public static String readInputString(String message) {
	    System.out.print(message);
	    return AppBuah.scanner.next();
	}

	public static double readInputNumber(String message) {
	    System.out.print(message);
	    return AppBuah.scanner.nextDouble();
	}
    
}