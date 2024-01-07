import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        List<SubjectInfo> subjectList = new ArrayList<>();

        System.out.print("Enter Total Subjects: ");
        int totalSubjects = sc.nextInt();

        for (int i = 1; i <= totalSubjects; i++) {
            System.out.print("Subject Name: ");
            String subjectName = sc.next();
            System.out.print("Enter Marks: ");
            int marks = sc.nextInt();
            System.out.print("Enter Subject ID: ");
            int subjectID = sc.nextInt();

            SubjectInfo subjectInfo = new SubjectInfo(subjectID, marks, subjectName);
            subjectList.add(subjectInfo);
        }

        // Sort the list based on highest marks for "Math" subject
        Collections.sort(subjectList, Comparator.comparingInt(SubjectInfo::getMarks).reversed());

        System.out.println("Sorted List based on highest marks in Math subject:");
        for (SubjectInfo subjectInfo : subjectList) {
            System.out.println(subjectInfo);
        }
    }
}

class SubjectInfo {
    private int subjectID;
    private int marks;
    private String subjectName;

    public SubjectInfo(int subjectID, int marks, String subjectName) {
        this.subjectID = subjectID;
        this.marks = marks;
        this.subjectName = subjectName;
    }

    public int getSubjectID() {
        return subjectID;
    }

    public int getMarks() {
        return marks;
    }

    public String getSubjectName() {
        return subjectName;
    }

    @Override
    public String toString() {
        return "SubjectInfo{" +
                "subjectID=" + subjectID +
                ", marks=" + marks +
                ", subjectName='" + subjectName + '\'' +
                '}';
    }
}
