import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilrarmonyService {
    private Filarmony filar;

    public Filarmony getFilar() {
        return filar;
    }

    public void setFilar(Filarmony filar) {
        this.filar = filar;
    }

    public List<Consert> allConsertsByMonthsAndYears(int month,int year){
        List<Consert> result = new ArrayList<>();
        LocalDate start = LocalDate.of(year,month,1);
        LocalDate end = LocalDate.of(year,month,28);
        Stream<Consert> conserts = filar.getListConserts().stream();
        for ( Consert consert:conserts){
            if (consert.getDate().compareTo(start) >= 0 && consert.getDate().compareTo(end) <= 0)
                result.add(consert);
        }
        return result;
    }

    public List<Employee> sortedEmployees(){
        List<Employee>workers = filar.getListEmployees();
        Collections.sort(workers);
        return workers;
    }
    public List<Consert> allConsertsByMonthsAndYearsStream(int month,int year){
        //Stream<Consert> result = new ArrayList<>();
        LocalDate start = LocalDate.of(year,month,1);
        LocalDate end = LocalDate.of(year,month,28);
        List<Consert> conserts = filar.getListConserts();
        return conserts.stream()
                .filter(consert -> consert.getDate().compareTo(start) >= 0 && consert.getDate().compareTo(end) <= 0).collect(Collectors.toList());

    }

    public List<Employee> sortedEmployeesStream(){
        return filar.getListEmployees().stream().sorted().collect(Collectors.toList());
    }
}
