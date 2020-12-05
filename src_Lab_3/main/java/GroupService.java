import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupService {
    private Group gr;

    public List<Employee> getDirectors(){
        List<Employee> result = new ArrayList<>();
        List<Employee> employees = gr.getEmployees();
        for ( Employee employer:employees){
            if (employer.getPost() == Position.DIRECTOR)
                result.add(employer);
        }
        return result;
    }
    public boolean ifNameBigger5letters(){
        if ( gr.getName().length() > 5) return true;
        else return false;
    }
    public List<Employee> getDirectorsStream(){
        return gr.getEmployees().stream().filter(employee -> employee.getPost()==Position.DIRECTOR).collect(Collectors.toList());
    }

}
