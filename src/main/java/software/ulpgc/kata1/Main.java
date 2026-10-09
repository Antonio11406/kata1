package software.ulpgc.kata1;

import java.time.LocalDate;

public class Main {
    static void main() {
        Person yo = new Person("Antonio", LocalDate.of(2006, 4, 11));
        System.out.println(yo.age());
    }
}
