public class EmployeeOprations {
    private Double salary;

    public EmployeeOprations(double salary) {
        this.salary = salary;
    }

    public double hra() {
        return this.salary * 0.50;
    }

    public double da() {
        return this.salary * 0.20;
    }

    public double ta() {
        return this.salary * 0.40;
    }

    public double ma() {
        return this.salary * 0.250;
    }

    public double pf() {
        return this.salary * 0.050;
    }

    public double gs() {
        return this.salary + this.hra() + this.da() + this.ta() + this.ma();
    }

    public double tax() {
        return this.salary * 0.10;
    }

    public double ns() {
        return this.gs() - this.tax() - this.pf();
    }
}
