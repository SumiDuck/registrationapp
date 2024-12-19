package model;

import java.util.List;

/**
 * An interface is an abstract class
 * that provides the method signature of
 * what a class must implement
 */

public interface Evaluation {

    // getApprovedCourses ia a method that returns a list of Courses
    List<Course> getApprovedCourses();
}
