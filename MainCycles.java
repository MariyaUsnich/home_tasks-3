import java.util.Scanner;

public class MainCycles {

    public static void main(String[] arg) {
        firstTask();
//        secondTask();
//        thirdTask();
    }

    private static void firstTask() {
//        String str = new String();
        Scanner scanner = new Scanner(System.in);
//        while (str.length() == 0) {
//
//            str = scanner.nextLine();
//        }
        while (true) {
            System.out.print("Please enter something");
//            System.out.println(str);
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


//        System.out.print("Please enter your score: ");
//        int score = new Scanner(System.in).nextInt();
//        if (score >= 70 && score <= 100) {
//            System.out.println("Congrats! You’ve passed the test!");
//        } else if (score >= 0 && score < 70) {
//            System.out.println("Sorry, you’ve failed the test.");
//        } else {
//            do {
//                System.out.println("Sorry, the score is incorrect. Please enter your score: ");
//                score = new Scanner(System.in).nextInt();
//            }
//            while (score <= 0 && score >= 100);
//        }
    }
}





