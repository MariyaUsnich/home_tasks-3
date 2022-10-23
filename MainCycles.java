import java.util.Scanner;

public class MainCycles {

    public static void main(String[] arg) {
        firstTask();
        secondTask();
        thirdTask();
        fourthTask();
    }

    private static void firstTask() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Please enter something");
            String str = scanner.nextLine();
            if (str.equalsIgnoreCase("Exit")) {
                break;
            }
        }
    }
    private static void secondTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int x = scanner.nextInt();
        int sum = 0;
        if (x >= 1) {
            for (int i = 0; i <= x; i++) {
                sum += i;
            }
            System.out.printf("The sum of all numbers from 0 to %d is %d", x, sum);
        } else if (x <= -1) {
            for (int i = 0; i >= x; i--) {
                sum += i;
            }
            System.out.printf("The sum of all numbers from %d to 0 is %d", x, sum);
        }
        System.out.println();
    }

    private static void thirdTask() {
        while (true) {
            System.out.print("Please enter your score: ");
            int score = new Scanner(System.in).nextInt();

            if (score >= 0 && score <= 100) {
                if (score >= 70) {
                    System.out.println("Congrats! You’ve passed the test!");
                } else {
                    System.out.println("Sorry, you’ve failed the test.");
                }
                break;
            } else {
                System.out.println("Sorry, the score is incorrect.");
            }

        }
    }
      private static void fourthTask() {
            String[] channels = new String[5];

            channels[0] = "Discovery";
            channels[1] = "ONT";
            channels[2] = "TNT";
            channels[3] = "National Geographic";
            channels[4] = "History";

            while (true) {
                System.out.println("Input channel number:");
                int channelNumber = new Scanner(System.in).nextInt();
                if (channelNumber == 0) {
                    break;
                } else if (channelNumber > 0 && channelNumber <= 5) {
                    System.out.println(channels[channelNumber - 1]);
                }
                else {
                    System.out.println("Channel is unavailable");
                }
            }
        }

     }






