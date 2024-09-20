package com.generation;

import com.generation.exceptions.CourseNotFoundException;
import com.generation.exceptions.StudentNotFoundException;

public class Main {
    public static void main(String[] args) {
	    StudentService studentService = new StudentService();
	    
	     studentService.addStudent(new Student ("Carlos", "1030", 31));
	     studentService.addStudent(new Student("Ian", "1040", 28));
	     studentService.addStudent(new Student("Elise", "1050", 26));
	     studentService.addStudent(new Student("Santiago", "1020", 33));
	     
        studentService.enrollStudents("Math", "1030");
        
        studentService.showAllCourses();
        studentService.showEnrolledStudents("Math");
        studentService.showEnrolledStudents("History");
        
        try {
        	studentService.enrollStudents("Math", "1030");
        } catch (CourseNotFoundException | StudentNotFoundException e) {
        	System.out.println(e.getMessage());
        } // catch
        
        try {
        	studentService.enrollStudents("Math", "1020");
        } catch (CourseNotFoundException | StudentNotFoundException e) {
        	System.out.println(e.getMessage());
        } // catch
        
        try {
        	studentService.enrollStudents("Math", "1040");
        } catch (CourseNotFoundException | StudentNotFoundException e) {
        	System.out.println(e.getMessage());
        } // catch
        
    } // main
} // class Main
