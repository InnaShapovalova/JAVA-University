package lab1;

import javax.swing.text.Position;
import java.time.LocalDate;


public interface Builder {
    void setLastName(String lastName);
    void setFirstName(String firstName);
    void setPosition(Position post);
    void setBirthday(LocalDate birthday);

    //void setPost(lab1.Position director);
}
