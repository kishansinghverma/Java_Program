import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Unmarshaller_Demo {
    public static void main(String[] args) throws JAXBException, FileNotFoundException {
        JAXBContext context=JAXBContext.newInstance(Student.class);
        Unmarshaller unmarshaller=context.createUnmarshaller();
        Student s1=(Student)unmarshaller.unmarshal(new FileInputStream("Student_DB.xml"));
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        System.out.println(s1.getRoll_no());
        System.out.println(s1.getCourse());
    }
}
