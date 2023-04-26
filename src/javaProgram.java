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
        //javaProgram.randomNumGen(5);
        randomNumFunction.randomNumber(25);
        javaProgram.stackTr();
        System.out.println("this is a value returned from a different class");
        int thisVal = returnTheValue.theValue(25);
        System.out.println(thisVal);
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
        int num = passIn;
        System.out.println();
        System.out.println(num);
        Random randomNum = new Random();
        int thisNum = randomNum.nextInt(10);
        int thisNum2 = randomNum.nextInt(10);
        int thisNum3 = randomNum.nextInt(10);
        System.out.println(thisNum);
        System.out.println(thisNum2);
        System.out.println(thisNum3);
        String result = String.valueOf(thisNum + "" + thisNum2 + "" + thisNum3);
        System.out.println(result);
        String result2 = result + 1;
        System.out.println(result2);


    }



        public static void stackTr() {

            System.out.println("this is StackTr");
            methodA();

        }

        public static void methodA() {
            try {
                int num1 = 5/0; // java.lang.ArithmeticException: divide by zero
                System.out.println("xxxxxxxxxxxx");
                System.out.printf("hello %.2f", num1);
                System.out.println();
                System.out.println(num1);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

