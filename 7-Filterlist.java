package com.company;

import java.util.ArrayList;
import java.util.List;

class A {
    int id;
    int marks;
    String subject;

    // Constructor
    public A(int id, int marks, String subject) {
        this.id = id;
        this.marks = marks;
        this.subject = subject;
    }

    // Getters
    public int getId() {
        return id;
    }

    public int getMarks() {
        return marks;
    }

    public String getSubject() {
        return subject;
    }
}

public class Main {
    // Marks threshold constant
    private static final int MARKS_THRESHOLD = 60;

    public static void main(String[] args) {
        // Create a list of class A objects
        List<A> aa = new ArrayList<>();
        aa.add(new A(1, 40, "Mathmatics"));
        aa.add(new A(2, 55, "Science"));
        aa.add(new A(3, 80, "English"));
        aa.add(new A(4, 65, "Geography"));

        List<A> filteredList = filterByMarks(aa, MARKS_THRESHOLD);
        System.out.println("Filtered List (Marks > " + MARKS_THRESHOLD + "):");
        for (A a : filteredList) {
            System.out.println("ID: " + a.getId() + ", Subject: " + a.getSubject() + ", Marks: " + a.getMarks());
        }
    }

    // Method to filter the list based on marks
    private static List<A> filterByMarks(List<A> inputList, int threshold) {
        List<A> filteredList = new ArrayList<>();
        for (A a : inputList) {
            if (a.getMarks() > threshold) {
                filteredList.add(a);
            }
        }
        return filteredList;
    }
}
