package com.generation.exceptions;

public class CourseNotFoundException extends Exception {
    public CourseNotFoundException(String message) {
        super("Course not found! [" + message + "]");
    }
}
