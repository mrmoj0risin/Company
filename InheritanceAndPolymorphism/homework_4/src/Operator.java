public class Operator implements Employee{

    private double baseSalary;

    public Operator(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double getMonthSalary() {
        return Math.round(baseSalary);
    }

    @Override
    public String toString() {
        return "Operator with salary "+ getMonthSalary();
    }
}
