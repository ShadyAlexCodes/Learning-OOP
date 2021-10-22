package com.example.learningoop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Using proper Object Orientated Programming methods.
        Student newStudent = new Student();
        newStudent.setFirstName("Xander");
        System.out.println(newStudent.getFirstName());

        Student secondNewStudent = new Student();
        secondNewStudent.createStudent("Xander", "Endre", 18, 3.9f);
        System.out.println(secondNewStudent.getStudent());

        // Class Example
        TestStudent testStudent = new TestStudent();
        System.out.println(testStudent.age);
        System.out.println(testStudent.firstName);

        TestStudent secondTestStudent = new TestStudent();
        secondTestStudent.firstName = "Xander";
        secondTestStudent.lastName = "Endre";
        System.out.println(secondTestStudent.firstName);
        System.out.println(secondTestStudent.lastName);
    }


}