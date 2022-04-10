public interface Employee extends Comparable {

    double getMonthSalary();

    @Override
    default int compareTo(Object o) {
        Employee employee = (Employee) o;

        int salaryIn = (int) employee.getMonthSalary();
        int salaryThis = (int) this.getMonthSalary();

        return Integer.compare(salaryThis,salaryIn);
    }

}
