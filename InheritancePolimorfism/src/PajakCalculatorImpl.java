package InheritancePolimorfism.src;

public class PajakCalculatorImpl implements PajakCalculator {
    private double pendapatan;

    public PajakCalculatorImpl(double pendapatan){
        this.pendapatan = pendapatan;
    }

    public double hitungPajak() {
        return pendapatan * 0.3;
    }

    public void testing(){
        System.out.println("coba interface");
    }
}