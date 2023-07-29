package org.example.models;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Person {
    private int id;

    @NotEmpty(message = "Ім'я не може бути пустим полем")
    @Size(min = 2, max = 100, message = "Ім'я повинно містити від 2 до 100 символів")
    private String fullName;

    @Min(value = 1900, message = "Рік народження повинен бути більшим, ніж 1900")
    private int yearOfBirth;

    // Конструктор за замовчуванням потрібен для Spring
    public Person() {

    }

    public Person(String fullName, int yearOfBirth) {
        this.fullName = fullName;
        this.yearOfBirth = yearOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
}