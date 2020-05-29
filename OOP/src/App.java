package OOP.src; 
// import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");

        // int salary = 50_000;
        // int overtime = 5;
        // int payPerHour = 100;

        // System.out.println(calculateWage(salary, overtime, payPerHour));

        Employee orang = new Employee(50_000, 100);

        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Input Salary: ");
        // orang.setSalary(scanner.nextInt());

        // System.out.print("Input Overtime: ");
        //orang.setOvertime(scanner.nextInt());

        // System.out.print("Input Pay per Hour: ");
        // orang.setPayPerHour(scanner.nextInt());

        //System.out.println(calculateWage(orang.getSalary(), orang.getOvertime(), orang.getPayPerHour()));

        System.out.println(orang.calculateWage());
       // System.out.println(Employee.employeeCount);

    }


    public static int calculateWage(int salary, int overtime, int payPerHour) {
        return salary + (overtime * payPerHour);
    }
}
