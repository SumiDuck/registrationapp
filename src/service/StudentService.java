package service;

import model.Course;
import model.Student;

import java.util.HashMap;
import java.util.Map;

public class StudentService {

    private final Map<String, Student> students = new HashMap<>();


    // subscribe Student

    public void subscribeStudent(Student student){
        students.put(student.getId(), student);
        // How do we store the student to students
    }
    //findStudent


    public Student findStudent(String studentId){
        if(students.containsKey(studentId)){
            return students.get(studentId);
        }
        return null;
    }

    public void enrollStudentToCourse(String studentId, Course course) {
            if(students.containsKey(studentId)) {
                students.get(studentId).enrollToCourse(course);
            }
    }

    public boolean isSubscribed(String studentId) {
        //TODO
        return students.containsKey(studentId);
    }
    // enrollStudentToCourse
    public void showSummary(){
        //TODO
    }
}
