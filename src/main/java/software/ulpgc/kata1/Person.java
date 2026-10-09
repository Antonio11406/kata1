package software.ulpgc.kata1;

import java.time.LocalDate;

public class Person {
    public Person(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    private final String name;
    private final LocalDate birthday;

    public int age(){
        long day = LocalDate.now().toEpochDay() - birthday.toEpochDay();
        return (int) (day/365.25);

    }

}
