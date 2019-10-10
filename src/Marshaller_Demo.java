import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Marshaller_Demo{
    public static void main(String[] args) throws JAXBException, FileNotFoundException {
        JAXBContext context=JAXBContext.newInstance(Student.class);
        Marshaller marshaller=context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        Student s1=new Student("Kishan", "MCA", 27, 21);
        marshaller.marshal(s1, new FileOutputStream("Student_DB.xml"));
    }
}