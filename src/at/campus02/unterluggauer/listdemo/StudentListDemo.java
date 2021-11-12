package at.campus02.unterluggauer.listdemo;

import java.util.ArrayList;

public class StudentListDemo
{
    public static void main(String[] args)
    {
        ArrayList<String> studentList = new ArrayList<>();

        studentList.add("Lahovnik");
        studentList.add("Lirzer");
        studentList.add("Unterluggauer");
        studentList.remove("Lahovnik");

        System.out.println(studentList.contains("Lahovnik"));
        print(studentList);
    }

    public static boolean isInList(ArrayList<String> studentList, String student)
    {
        for (String studentInList : studentList)
        {
            if (studentInList.equals(student))
            {
                return true;
            }
        }
        return false;
    }

    public static void print(ArrayList<String> studentList)
    {
        for (String element : studentList)
        {
            System.out.println("element = " + element);
        }
    }
}
