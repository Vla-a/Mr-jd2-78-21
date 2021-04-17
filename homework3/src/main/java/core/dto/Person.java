package by.it_academy.jd2.core.dto;

@Entity
@Table(name = "person_test", shema = ="hibernate")
public class Person implements Serializeble{

    @id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private id;
    private String lastName;
    private String firstName;
    private int age;

    public String getLastName() {

        return lastName;
    }

    public void setLastName(String Name) {

        this.lastName = Name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
