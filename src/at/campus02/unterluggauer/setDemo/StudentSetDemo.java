package at.campus02.unterluggauer.setDemo;

import java.util.HashSet;

public class StudentSetDemo
{
    public static void main(String[] args)
    {
        HashSet<String> students = new HashSet<>();

        students.add("Max Mustermann");
        students.add("Susi Sorglos");

        System.out.println("students = " + students);

        students.remove("Susi Sorglos");
        System.out.println("students = " + students);

        boolean isSusiInSet = students.contains("Susi Sorglos");
        boolean isMaxInSet = students.contains("Max Mustermann");
        System.out.println("isSusiInSet = " + isSusiInSet);
        System.out.println("isMaxInSet = " + isMaxInSet);

        for (String student: students)
        {
            System.out.println("students = " + students);
        }
    }
}
