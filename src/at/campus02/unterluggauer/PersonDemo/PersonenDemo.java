package at.campus02.unterluggauer.PersonDemo;

import at.campus02.unterluggauer.PersonDemo.Person;

public class PersonenDemo
{
    public static void main(String[] args)
    {
        Person person1 = new Person("Max", "Mustermann");
        Person person2 = new Person("Max", "Mustermann");
        
        boolean isEquals = person1.equals(person2);
        System.out.println("isEquals = " + isEquals);
    }
}
