package creational.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Budyn on 06.05.2018.
 */
public class Employee implements Cloneable {
    private List<String> employeeList;

    public Employee() {
        employeeList = new ArrayList<>();
    }

    public Employee(List<String> employeeList) {
        this.employeeList = employeeList;
    }

    public void loadData() {
        employeeList.add("Anon");
        employeeList.add("Anon2");
        employeeList.add("Anon3");
    }

    public List<String> getEmployeeList() {
        return employeeList;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        List<String> temp = new ArrayList<>(getEmployeeList());
        return new Employee(temp);
    }
}
