import java.util.Random;

public class randomNumFunction {

    public static void randomNumber(int passInt) {
        System.out.println("this is from a different file");
        int num = passInt;
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
}
