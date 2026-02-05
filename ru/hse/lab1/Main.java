package ru.hse.lab1;

import ru.hse.lab1.second.Person;

/**
 * @author Иван Ермошин
 * @version 1.0
 * @since 2026
 */

public class Main {
    public static void main(String[] args)
    {
        Person ivan = new Person("Ivan", 18);

        System.out.println("Name: " + ivan.getName() + ", Age: " + ivan.getAge() + '\n');
    }
}
