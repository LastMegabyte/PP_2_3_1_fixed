package web.model;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @NotEmpty(message = "Name should not be empty")
    @Size(min = 2, max = 45, message = "Name should be between 2 and 45 characters")
    @Column(name = "name")
    private String name;

    @NotEmpty(message = "Surname should not be empty")
    @Size(min = 2, max = 100, message = "Surname should be between 2 and 100 characters")
    @Column(name = "surname")
    private String surname;

    @Min(value = 0, message = "Age should be greater than 0")
    @Column(name = "age")
    private long age;

    public User(String name, String surname, long age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public User() {

    }

    @Override
    public String toString() {
        return String.format("ID: %d Name: %s %s Age: %d", id, name, surname, age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
