package by.it_academy.jd2.core.dto;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "person_test", schema = "hibernate")
public class Person implements Serializable {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}

