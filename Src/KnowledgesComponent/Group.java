package KnowledgesComponent;

import java.util.HashMap;

public class Group {
    private final HashMap<String, Student> students = new HashMap<>();

    public void addStudent(Student student){
        students.put(student.getStudentID(), student);
    }

    public Student getStudent(String StudentID){
        Student targetStudent = null;
        if(students.containsKey(StudentID)){
            targetStudent = students.get(StudentID);
        }
        return targetStudent;
    }
}
