package lab1;

import java.util.List;
import java.util.Objects;

public class Filarmony {
    private List<Employee> workers;
    private List <Consert> conserts;

    public Filarmony(List<Employee> workers, List <Consert> conserts){
        this.workers = workers;
        this.conserts = conserts;
    }

    public List<Employee> GetListEmployees(){
        return workers;
    }
    public List<Consert> GetListConserts(){
        return conserts;
    }
    /**
     * @param ob
     * @return object.equals
     */
    public boolean equals(Object ob) {
        if (this == ob) return true;
        if (ob == null || getClass() != ob.getClass()) return false;
        Filarmony fil = (Filarmony) ob;
        return Objects.equals(workers, fil.workers) &&
                Objects.equals(conserts, fil.conserts) ;
    }
    /**
     * @param
     * @return string
     */
    public String toString() {
        return "Filarmony{" +
                "workers: " + workers.toString() + '\'' +
                ", conserts: " + conserts.toString() + '}';
    }

}