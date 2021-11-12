package at.campus02.unterluggauer.MapDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo
{
    public static void main(String[] args)
    {
        HashMap<String, Integer> gradeOfStudents = new HashMap<>();

        gradeOfStudents.put("Max Mustermann", 1);
        gradeOfStudents.put("Susi Sorglos", 2);
        System.out.println("gradeOfStudents = " + gradeOfStudents);

        gradeOfStudents.put("Max Mustermann", 2);
        System.out.println("gradeOfStudents = " + gradeOfStudents);

        Set<String> students = gradeOfStudents.keySet();
        for (String student : students)
        {
            Integer grade = gradeOfStudents.get(student);
            System.out.println("student = " + student + " hat die Note " + grade);
        }

        Set<Map.Entry<String, Integer>> entries = gradeOfStudents.entrySet();

        for (Map.Entry<String, Integer> entry : gradeOfStudents.entrySet())
        {
            System.out.println("entry = " + entry);
        }
    }
}
