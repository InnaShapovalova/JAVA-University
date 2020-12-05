import java.util.List;
import java.util.Objects;

public class Group {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    private List<Employee> employees;

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public Group(String name, List<Employee>employer ){
        this.name = name;
        this.employees = employer;
    }

    public String GetName(){
        return name;
    }
    public List<Employee> GetEmployer(){
        return employees;
    }
    @Override
    public boolean equals(Object ob) {
        if (this == ob) return true;
        if (ob == null || getClass() != ob.getClass()) return false;
        Group gr = (Group) ob;
        return Objects.equals(name, gr.name) &&
                Objects.equals(employees, gr.employees);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, employees);
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", employer='" + employees.toString();
    }
}