package serialize;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;

public class XmlSerializer<T> implements Serializer<T> {
    private static XmlMapper mapper;
    private Class<T> clazz;

    public XmlSerializer(Class<T> type) {
        this.clazz = type;
        mapper = new XmlMapper();
        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
    }

    public Class<T> getClazz() {
        return clazz;
    }

    public void setClazz(Class<T> clazz) {
        this.clazz = clazz;
    }

    @Override
    public void toFile(T person, File file) throws IOException {
        XmlMapper xml = new XmlMapper();
        xml.writeValue(file,person);
    }

    @Override
    public T fromFile(File file) throws IOException {
        return mapper.readValue(file, clazz);
    }

    @Override
    public String toString(T person) {
        try {
            return mapper.writeValueAsString(person);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public T fromString(String string) {
        try {
            return mapper.readValue(string, clazz);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

}

