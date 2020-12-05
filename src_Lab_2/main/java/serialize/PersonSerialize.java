package serialize;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import javax.xml.XMLConstants;
import javax.xml.crypto.dsig.XMLObject;
import javax.xml.crypto.dsig.XMLSignatureException;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import com.fasterxml.jackson.databind.SerializationFeature;
import serialize.*;


public class PersonSerialize {

    public static void main(String[] args) throws IOException, ParseException {
        LocalDate date = LocalDate.of(2020, 1, 8);
        serialize.Person ps = new serialize.Person("Inna", "Shapovalova", 1, date);
        //--------------JSON--------------------------------
        Serializer<serialize.Person>ser = new JsonSerializer<>(serialize.Person.class);
        System.out.println(ser.toString(ps));
        ser.toFile(ps,new File("Person.json"));
        //--------------XML--------------------------------
        ser = new XmlSerializer<>(serialize.Person.class);
        System.out.println(ser.toString(ps));
        ser.toFile(ps,new File("Person.xml"));
        //--------------TXT--------------------------------
        ser = new TxtPersonSerializer(Person.class);
        ser.toFile(ps,new File("Person.txt"));
    }
}
