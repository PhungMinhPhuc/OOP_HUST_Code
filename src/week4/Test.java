package week4;

import java.util.*;

public class Test {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        sc.nextLine();
        Student cls[] = new Student[n];
        for(int i=0; i<n; i++)
        {
            System.out.println("Enter student " + (i+1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Year: ");
            int year = sc.nextInt();
            sc.nextLine();
            cls[i] = new Student(name, year);
        }
        sc.close();
        for(int i=0; i<n; i++) System.out.println(cls[i].getName() + " " + cls[i].getYear());
    }
}
