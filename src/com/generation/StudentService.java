package com.generation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StudentService{
    HashMap<String, Course> courseList = new HashMap<>();
    HashMap<String, Student> students = new HashMap<>();
    HashMap<String, List<Course>> coursesEnrolledByStudents = new HashMap<>();

    public StudentService() {
        courseList.put("Math", new Course("Math", 10, "Aurelio Baldor"));
        courseList.put("Physics", new Course("Physics", 10, "Albert Einstein"));
        courseList.put("Art", new Course("Art", 10, "Pablo Picasso"));
        courseList.put("History", new Course("History", 10, "Sima Qian"));
        courseList.put("Biology", new Course("Biology", 10, "Charles Darwin"));
    }

    public void enrollStudents(String courseName, String studentID) {
        Course course = courseList.get(courseName);

        if (!coursesEnrolledByStudents.containsKey(studentID)){
            coursesEnrolledByStudents.put(studentID, new ArrayList<>() );
          } coursesEnrolledByStudents.get(studentID).add(course);
    } // enrollStudents

    public void unEnrollStudents(String courseName, String studentID){
        Course course = courseList.get(courseName);

        if ( coursesEnrolledByStudents.containsKey(studentID)) {
             coursesEnrolledByStudents.get(studentID).remove(course);
        }
    } // unEnrollStudents

    public void showEnrolledStudents(String courseId){
        Course course = courseList.get(courseId);
        for (String studentId : coursesEnrolledByStudents.keySet()) {
			List<Course> allCourse = coursesEnrolledByStudents.get(studentId);
			if (allCourse.contains(course)) {
				Student student = students.get(studentId);
				System.out.println(student);
			}
		}
    } // showEnrolledStudents

    public void showAllCourses(){
        for (Course course : courseList.values()) {
        System.out.println(course);
        }
    } // showAllCourses

	public void addStudent(Student student) {
		students.put(student.getId(), student); 
	} // addStudent
}