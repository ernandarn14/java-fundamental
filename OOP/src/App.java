package OOP.src;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");

        int salary = 50_000;
        int overtime = 5;
        int payPerHour = 100;

        System.out.println(calculateWage(salary, overtime, payPerHour));
    }


    public static int calculateWage(int salary, int overtime, int payPerHour) {
        return salary + (overtime * payPerHour);
    }
}
