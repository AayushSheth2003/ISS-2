import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Student {
    private int id;
    private int age;
    private String name;

    public Student(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    // Getters and setters (omitted for brevity)

    @Override
    public String toString() {
        return "Student{id=" + id + ", age=" + age + ", name='" + name + '\'' + '}';
    }
}

class Subject {
    private int id;
    private String name;

    public Subject(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters and setters (omitted for brevity)

    @Override
    public String toString() {
        return "Subject{id=" + id + ", name='" + name + '\'' + '}';
    }
}

public class StudentSubjectMapExample {
    public static void main(String[] args) {
        // Create instances of Student and Subject
        Student student1 = new Student(1, 20, "John");
        Student student2 = new Student(2, 22, "Alice");

        Subject subject1 = new Subject(101, "Math");
        Subject subject2 = new Subject(102, "History");
        Subject subject3 = new Subject(103, "Science");
        Map<Student, List<Subject>> studentSubjectMap = new HashMap<>();
        List<Subject> subjectsForStudent1 = new ArrayList<>();
        subjectsForStudent1.add(subject1);
        subjectsForStudent1.add(subject2);
        studentSubjectMap.put(student1, subjectsForStudent1);
        List<Subject> subjectsForStudent2 = new ArrayList<>();
        subjectsForStudent2.add(subject2);
        subjectsForStudent2.add(subject3);
        studentSubjectMap.put(student2, subjectsForStudent2);
        studentSubjectMap.forEach((student, subjects) -> {
            System.out.println("Student: " + student);
            System.out.println("Subjects: " + subjects);
            System.out.println();
        });
    }
}
