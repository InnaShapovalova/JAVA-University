package serialize;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TxtPersonSerializer implements Serializer<Person> {
    private static ObjectMapper mapper;
    private Class<Person> clazz;

    public TxtPersonSerializer(Class<Person> type) {
        this.clazz = type;
    }

    public Class<Person> getClazz() {
        return clazz;
    }

    public void setClazz(Class<Person> clazz) {
        this.clazz = Person.class;
    }

    @Override
    public void toFile(Person person, File file) throws IOException {
        ObjectMapper ob = new ObjectMapper();
        ob.writeValue(file, person);
    }

    @Override
    public Person fromFile(File file) throws IOException {
        return mapper.readValue(file, clazz);
    }

    @Override
    public String toString(Person person) {
        try {
            return mapper.writeValueAsString(person);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public Person fromString(String string) {
        try {
            return mapper.readValue(string, clazz);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

}
