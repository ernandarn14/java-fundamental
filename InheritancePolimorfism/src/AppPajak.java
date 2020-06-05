package InheritancePolimorfism.src;

public class AppPajak {
    public static void main(String[] args) throws Exception {
        PajakCalculatorImpl2 calculator = new PajakCalculatorImpl2();
        PajakReport report = new PajakReport(calculator);
        report.show();
    }

}