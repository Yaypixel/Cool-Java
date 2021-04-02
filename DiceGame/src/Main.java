import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        int ouput = roll();
        int ouput2 = roll();
        int sum = ouput + ouput2;
        System.out.println(ouput + "," + ouput2);
        System.out.println(sum);

        if (sum == 2 || sum == 3 || sum == 12)
        {
            System.out.println("Ya lost");
        }
        else if (sum == 7 || sum == 11)
        {
            System.out.println("Ya win");
        }
        else
        {
            int ouput3, ouput4, sum2;
            do
            {
                Thread.sleep(2000);
                 ouput3 = roll();
                 ouput4 = roll();
                 sum2 = ouput3 + ouput4;
                 System.out.println(ouput3 + "+" + ouput4 + "=" + sum2);
            }
            while (sum2 != sum && sum2 != 7);
            if (sum2 == sum)
            {
                System.out.println("Ya Won");
            }
            else
            {
                System.out.println("Ya lost");
            }

        }
    }
    static int roll()
    {
        return (int)(Math.random() * 6 + 1);

    }
}
