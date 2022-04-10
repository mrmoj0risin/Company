public class TopManager implements Employee{

    private double baseSalary;
    private double companiesRevenue;

    public TopManager(double baseSalary, double companiesRevenue) {
        this.baseSalary = baseSalary;
        this.companiesRevenue = companiesRevenue;
    }

    @Override
    public double getMonthSalary() {
        if (companiesRevenue >= 10_000_000){
            return Math.round(baseSalary * 1.5);
        }
        else {
            return Math.round(baseSalary);
        }
    }

    @Override
    public String toString() {
        return "TopManager " +
                "with salary " + this.getMonthSalary() ;
    }
}
