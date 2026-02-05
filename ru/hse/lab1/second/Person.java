package ru.hse.lab1.second;

/**
 * @author Иван Ермошин
 * @version 1.0
 * @since 2026
 */

public class Person {
    String m_name = "";
    int m_age = 0;

    public Person(String name, int age)
    {
        this.m_name = name;
        this.m_age = age;
    }

    public String getName(){ return m_name; }
    public int getAge(){ return m_age; }
}
