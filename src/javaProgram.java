import java.time.Duration;
import java.util.*;
import java.util.Random;

public class javaProgram {
    public static void main(String[] args) {
        System.out.println("hello mike");
        String name = "Mike Fey rocks";
        int age = 50;
        System.out.println(name);
        System.out.printf("hello %s %d%n", name, age);
        System.out.printf(String.format("%d %S %d%n", age, name, age));
        System.out.println(name);
        javaProgram.method2(null);
        javaProgram.randomNumGen(5);
    }
    public static void method2(String[] args) {
        System.out.println("hello mike");
        String name = "Mike Fey rocks2";
        int age = 50;
        System.out.println(name);
        System.out.println("++++++++++++++");
        System.out.printf("hello %s %d%n", name, age);
        System.out.printf(String.format("%d %S %d%n", age, name, age));
        System.out.println(name);
    }
    public static void randomNumGen(int passIn) {
//random
        int num = passIn + 200;
        System.out.println();
        System.out.println(num);
        Random randomNum = new Random();
        int thisNum = randomNum.nextInt(1000);
        System.out.println(thisNum);


    }
}
