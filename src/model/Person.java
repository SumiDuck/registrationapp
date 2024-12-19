package model;

import java.util.Date;
import java.util.List;
/*
* Person class is an abstract class
* As an abstract class, I should not be able to create an instance out of it
*
* As the attributes are set to final (immutable)
* we will need the constructor to set each attribute
*/


public abstract class Person {

    private final String id;

    private final String name;

    private final String email;

    private final Date DOB;



    public Person(String id, String name, String email, Date DOB) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.DOB = DOB;
    }

    //Getters and Setters (because you don't have direct access to the properties)


    public String getId() {
        return id;
    }

//    public void setId(int id) {
//        this.id = id;
//    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public String getEmail() {
        return email;
    }

//    public void setEmail(String email) {
//        this.email = email;
//    }

    public Date getDOB() {
        return DOB;
    }

//    public void setDOB(Date DOB) {
//        this.DOB = DOB;
//    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", DOB=" + DOB +
                '}';
    }

    public abstract List<Course> getApprovedCourses();
}
