import java.time.Duration;
import java.util.*;

public class javaProgram {
    public static void main(String[] args) {
        System.out.println("hello mike");
        String name = "Mike Fey rocks";
        int age = 50;
        System.out.println(name);
        System.out.printf("hello %s %d%n", name, age);
        System.out.printf(String.format("%d %S %d%n", age, name, age));
        System.out.println(name);
    }
}
