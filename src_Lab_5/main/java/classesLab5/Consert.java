package classesLab5;

import java.time.LocalDate;
import java.util.Objects;

public class Consert {
    private LocalDate date;
    private Group collective;

    public Consert( LocalDate date, classesLab5.Group collective){
        this.date = date;
        this.collective = collective;
    }

    public LocalDate GetDate(){
        return date;
    }
    public classesLab5.Group GetGroup(){
        return collective;
    }
    @Override
    public boolean equals(Object ob) {
        if (this == ob) return true;
        if (ob == null || getClass() != ob.getClass()) return false;
        Consert con = (Consert) ob;
        return Objects.equals(date, con.date) &&
                Objects.equals(collective, con.collective);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, collective);
    }

    @Override
    public String toString() {
        return "Consert{" +
                "date ='" + date.toString() + '\'' +
                ", collective'" + collective.toString()+'}';
    }
}