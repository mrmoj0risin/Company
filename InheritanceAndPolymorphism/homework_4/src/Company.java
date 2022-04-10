import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Company {

    private double income;
    private Employee employee;
    private List<Employee> employeeList = new ArrayList<>();

    public Company(double income) {
        this.income = income;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

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

    public void fire(int count){
        List<Employee> employees =  this.getEmployeeList();

        for (int i = 0; i < count; i++) employees.remove(i);
    }

    public List<Employee> getLowestSalaryStaff(int count){
        ArrayList<Employee> employees = new ArrayList<>();
        ArrayList<Employee> employeesComp;

        employeesComp = (ArrayList<Employee>) this.getEmployeeList();

        Collections.reverse(employeesComp);

        for (int i =0; i < count; i++){
            employees.add(employeesComp.get(i));
        }

        return employees;
    }

    public List<Employee> getTopSalaryStaff(int count){
        ArrayList<Employee> employees = new ArrayList<>();
        ArrayList<Employee> employeesComp;

        employeesComp = (ArrayList<Employee>) this.getEmployeeList();

        Collections.sort(employeesComp);

        if (count > employeesComp.size()){
            count = employeesComp.size();
        }

        for (int i =0; i < count; i++){
            employees.add(employeesComp.get(i));
        }

        return employees;
    }
}
