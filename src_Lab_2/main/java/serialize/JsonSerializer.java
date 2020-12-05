package serialize;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;

public class JsonSerializer<T> implements Serializer<T> {
    private static ObjectMapper mapper;
    private Class<T> clazz;

    public JsonSerializer(Class<T> type) {
        this.clazz=type;
        mapper = new ObjectMapper();
        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
    }

    public String toJson(Class<T> type) throws JsonProcessingException {
        this.clazz = type;
        ObjectMapper objectMapper = new ObjectMapper();
        String s;
        s = objectMapper.writeValueAsString(type);
        return s;
    }

    public Class<T> getClazz() {
        return clazz;
    }

    public void setClazz(Class<T> clazz) {
        this.clazz = clazz;
    }

    @Override
    public void toFile(T person, File file) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(file,person);

    }

    @Override
    public T fromFile(File file) throws IOException {
        return mapper.readValue(file, clazz);
    }

    @Override
    public String toString(T person)  {
        try {
            return mapper.writeValueAsString(person);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public T fromString(String string)  {
        try {
            return mapper.readValue(string, clazz);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

}
