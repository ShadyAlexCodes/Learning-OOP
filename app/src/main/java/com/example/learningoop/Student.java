package com.example.learningoop;

public class Student {

    // define global variables
    String firstName;
    String lastName;
    int age;
    float GPA;

    // Create a constructor that'll pass student information
    public void createStudent(String firstName, String lastName, int age, float GPA) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.GPA = GPA;
    }

    // Grab the students First Name
    public String getFirstName() {
        return firstName;
    }

    // Grab the students Last Name
    public String getLastName() {
        return lastName;
    }

    // Grab the students Age
    public int getAge() {
        return age;
    }

    // Grab the students GPA
    public float getGPA() {
        return GPA;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
    }

    public String getStudent() {
        return "First Name: " + getFirstName()
                + "\nLast Name: " + getLastName()
                + "\nAge: " + getAge()
                + "\nGPA: " + getGPA();
    }
}
