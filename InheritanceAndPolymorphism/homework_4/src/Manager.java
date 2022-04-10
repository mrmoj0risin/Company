public class Manager implements Employee{

    private double baseSalary;
    private double companiesRevenue;

    public Manager(double baseSalary, double companiesRevenue) {
        this.baseSalary = baseSalary;
        this.companiesRevenue = companiesRevenue;
    }

    @Override
    public double getMonthSalary() {

        return Math.round( baseSalary + (companiesRevenue * 0.05));
    }

    @Override
    public String toString() {
        return "Manager " +
                "with salary " + this.getMonthSalary();
    }
}
