import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student{
    private String name;
    private String Course;
    private int roll_no;
    private int age;

    public Student(){}
    public Student(String name, String course, int roll_no, int age) {
        this.name = name;
        Course = course;
        this.roll_no = roll_no;
        this.age = age;
    }

    @XmlElement
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement
    public String getCourse() {
        return Course;
    }

    public void setCourse(String course) {
        Course = course;
    }

    @XmlAttribute
    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    @XmlElement
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}