package oop;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        StudentList List = new StudentList();
        Scanner scanner = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("\n=====>Menu<=====:");
            System.out.println("1. Them thong tin sinh vien.");
            System.out.println("2. Hien thi danh sach sinh vien.");
            System.out.println("3. Tim sinh vien theo ID");
            System.out.println("4. Xoa sinh vien theo ID");
            System.out.println("5. Chinh sua sinh vien theo ID");
            System.out.println("6. Exit");
            System.out.print("Nhap lua chon: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Nhap so sinh vien can them: ");
                    int n = scanner.nextInt();
                    scanner.nextLine();
                    List.addStudents(n);
                    break;
                case 2:
                    List.displayAllStudents();
                    break;
                case 3:
                    System.out.print("Nhap Ma so sinh vien can tim: ");
                    String idToFind = scanner.nextLine();
                    Student foundStudent = List.findStudentById(idToFind);
                    if (foundStudent != null) {
                        foundStudent.displayInformation();
                    } else {
                        System.out.println("Khong tim thay sinh vien.");
                    }
                    break;
                case 4:
                    System.out.print("Nhap ma so sinh vien can xoa: ");
                    String idToDelete = scanner.nextLine();
                    List.deleteStudentById(idToDelete);
                    break;
                case 5:
                    System.out.print("Nhap ma so sinh vien can chinh sua: ");
                    String idToEdit = scanner.nextLine();
                    List.editStudentById(idToEdit);
                    break;
                case 6:
                    System.out.println("Ban da thoat khoi chuong trinh...");
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long nhap lai. ");
            }
        }
    }
}
