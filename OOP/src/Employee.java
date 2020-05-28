package OOP.src;

public class Employee {
    private int salary;
    private int overtime;
    private int payPerHour;

    public static int employeeCount;

    public Employee(int salary, int payPerHour) {
        setSalary(salary);
        setPayPerHour(payPerHour);
        employeeCount++;
    }

    public Employee(int salary) {
        this(salary, 0);
    }

    public int getSalary() {
        return salary;
    }

    private void setSalary(int salary) {
        if (salary <= 0) {
            throw new IllegalArgumentException("Salary can't below 0");
        }
        this.salary = salary;
    }

    public int getOvertime() {
        return overtime;
    }

    private void setOvertime(int overtime) {
        if (overtime < 0) {
            throw new IllegalArgumentException("Overtime can't below 0");
        }
        this.overtime = overtime;
    }

    public int getPayPerHour() {
        return payPerHour;
    }

    private void setPayPerHour(int payPerHour) {
        if (payPerHour <= 0) {
            throw new IllegalArgumentException("Pay per Hour can't below 0");
        }
        this.payPerHour = payPerHour;
    }

    public int calculateWage() {
        // return this.salary;
        return calculateWage(0);
    }

    public int calculateWage(int overtime) {
        setOvertime(overtime);
        return this.salary + (this.overtime * this.payPerHour);
    }
}