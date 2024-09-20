package com.generation;

import com.generation.exceptions.CourseNotFoundException;
import com.generation.exceptions.StudentNotFoundException;

public class Main {
    public static void main(String[] args) {
	    StudentService studentService = new StudentService();
	    
	    //TODO reactor this code to use encapsulation inside studentsService
	    // studentService.students.put("1030", new Student("Carlos", "1030", 31));
        // studentService.students.put("1040", new Student("Ian", "1020", 28));
        // studentService.students.put("1050", new Student("Elise", "1020", 26));
        // studentService.students.put("1020", new Student("Santiago", "1020", 33));

	    studentService.addStudent("Carlos", "1030", 31);
	    studentService.addStudent("Ian", "1040", 28);
	    studentService.addStudent("Elise", "1050", 26);
	    studentService.addStudent("Santiago", "1020", 33);

        studentService.enrollStudents( "Math", "1030" );
        
    } // main
} // class Main
