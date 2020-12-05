package validator;

import java.util.List;
import java.util.Objects;

public class Group {
    private String name;
    private List<Employee> employer;

    public Group(String name, List<Employee>employer ){
        this.name = name;
        this.employer = employer;
    }

    public String GetName(){
        return name;
    }
    public List<Employee> GetEmployer(){
        return employer;
    }
    @Override
    public boolean equals(Object ob) {
        if (this == ob) return true;
        if (ob == null || getClass() != ob.getClass()) return false;
        Group gr = (Group) ob;
        return Objects.equals(name, gr.name) &&
                Objects.equals(employer, gr.employer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, employer);
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", employer='" + employer.toString();
    }
}
