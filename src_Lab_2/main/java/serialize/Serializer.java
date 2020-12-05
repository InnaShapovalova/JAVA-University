package serialize;

import java.io.File;
import java.io.IOException;

public interface Serializer<T> {

    void toFile(T student, File file) throws IOException;

    T fromFile(File file) throws IOException;

    String toString(T student);

    T fromString(String string);

}
