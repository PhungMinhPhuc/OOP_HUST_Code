/*• Lớp Test
• Nhập số phần tử cho mảng Student (trong 1 lớp học)
• Nhập lần lượt các Student
• In ra danh sách tên Student trong lớp và hiển thị tổng số
tuổi của các Student */

package week4;

import java.util.*;

public class Test {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();
        Student cls[] = new Student[n];
        int total = 0;
        for(int i=0; i<n; i++)
        {
            System.out.println("Enter student " + (i+1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Year: ");
            int year = sc.nextInt();
            sc.nextLine();
            cls[i] = new Student(name, year);
            total += (2026 - year);
        }
        sc.close();
        System.out.println("List of students:");
        for(int i=0; i<n; i++) System.out.println(cls[i].getName() + " " + cls[i].getYear());
        System.out.println("Total age: " + total);
    }
}
