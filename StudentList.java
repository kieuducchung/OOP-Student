package oop;

import java.util.ArrayList;

public class StudentList {

    ArrayList<Student> studentList = new ArrayList<>();

    public void addStudents(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("\nNhap thong tin sinh vien " + (i + 1) + ":");
            Student student = new Student();
            student.enterStudentInfo();
            studentList.add(student);
        }
        System.out.println("Them " + n + " Sinh vien thanh cong!");
    }

    public void displayAllStudents() {
        if (studentList.isEmpty()) {
            System.out.println("Khong co sinh vien trong danh sach.");
        } else {
            System.out.println("\nDanh sach sinh vien:");
            for (Student student : studentList) {
                student.displayInformation();
            }
        }
    }

    public Student findStudentById(String idToFind) {
        for (Student student : studentList) {
            if (student.ID.equals(idToFind)) {
                return student;
            }
        }
        return null;
    }

    public boolean deleteStudentById(String idToDelete) {
        Student student = findStudentById(idToDelete);
        if (student != null) {
            studentList.remove(student);
            System.out.println("Sinh vien co ID la " + idToDelete + " da duoc xoa thanh cong.");
            return true;
        }
        System.out.println("Sinh vien co ID la " + idToDelete + " khong co trong danh sach.");
        return false;
    }

    public boolean editStudentById(String idToEdit) {
        Student student = findStudentById(idToEdit);
        if (student != null) {
            System.out.println("Chinh sua cho sinh vien co ID: " + idToEdit);
            student.enterStudentInfo();
            return true;
        }
        System.out.println("Sinh vien co ID la " + idToEdit + " khong co trong danh sach.");
        return false;
    }
}
