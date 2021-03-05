import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner yay = new Scanner(System.in);

            System.out.println("welcome to roboty awsome! how can i help you today?");
            int aws = yay.nextInt();
            System.out.println("You said " + aws + " is that correct?");
            int cool = yay.nextInt();
            if (cool == 1) {
                System.out.println("ok starting line " + aws);
            }
            if (cool == 2) {
                System.out.println("ok");
            }

        }
    }
