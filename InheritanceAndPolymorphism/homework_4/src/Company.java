import java.util.ArrayList;
import java.util.List;

public class Company {

    private double income;
    private Employee employee;

    private List<Employee> employeeList = new ArrayList<>();

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public void hire(Employee employee){
        employeeList.add(employee);
    }

    public void hireAll (List<Employee> employees){
        employeeList.addAll(employees);
    }

    public void fire(Employee employee){
        if (employeeList.contains(employee)) {
            employeeList.remove(employee);
        }
    }



}
