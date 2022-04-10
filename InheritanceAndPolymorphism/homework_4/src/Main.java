import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Company company = new Company(25000000);

        company.hireAll(createOperators(180));
        company.hireAll(createManagers(company,80));
        company.hireAll(createTopManagers(company,10));

        System.out.println("TOP");
        company.getTopSalaryStaff(10).forEach(System.out::println);

        System.out.println("LOW");
        for (Employee employee: company.getLowestSalaryStaff(30)){
            System.out.println(employee);
        }

        System.out.println("=========Fired 50% of employees=========");
        company.fire(company.getEmployeeList().size() / 2);

        System.out.println("TOP");
        company.getTopSalaryStaff(10).forEach(System.out::println);

        System.out.println("LOW");
        for (Employee employee: company.getLowestSalaryStaff(30)){
            System.out.println(employee);
        }

    }

    public static List<Employee> createManagers(Company company, int count ){
        ArrayList<Employee> managers = new ArrayList<>();

        for (int i=0; i<count; i++ ){
           managers.add( new Manager(getRandomSalary(),company.getIncome()));
        }

        return managers;
    }

    public static ArrayList<Employee> createTopManagers(Company company, int count ){
        ArrayList<Employee> topManagers = new ArrayList<>();

        for (int i=0; i<count; i++ ){
            topManagers.add( new TopManager(getRandomSalaryTop(),company.getIncome()));
        }

        return topManagers;
    }

    public static List<Employee> createOperators(int count ){
        ArrayList<Employee> operators = new ArrayList<>();

        for (int i=0; i<count; i++ ){
            operators.add( new Operator(getRandomSalary()));
        }

        return operators;
    }

    public static double getRandomSalary(){
        return (10000 * Math.random()) +100_000;
    }

    public static double getRandomSalaryTop(){
        return (100000 * Math.random()) +900_000;
    }

}
