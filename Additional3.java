import java.util.Scanner;

public class Additional3 {
    public static void main(String[] args) {

        String firstName = "";
        String lastName = "";
        int bYear = 1990;

        while (true) {
            System.out.println("-----------------------------");
            System.out.println("1.Ввести имя");
            System.out.println("2.Ввести фамилию");
            System.out.println("3.Ввести год рождения");
            System.out.println("4.Вывести информацию");
            System.out.println("0.Выход");
            System.out.println("-----------------------------");

            System.out.print("Please enter a number from 1 to 5: ");
            int number = new Scanner(System.in).nextInt();

            switch (number) {
                case 1: {
                    System.out.println("Введите имя:");
                    firstName = new Scanner(System.in).nextLine();
                    break;
                }
                case 2: {
                    System.out.println("Введите фамилию:");
                    lastName = new Scanner(System.in).nextLine();
                    break;
                }
                case 3: {
                    System.out.println("Введите год рождения:");
                    bYear = new Scanner(System.in).nextInt();
                    break;
                }
                case 4: {
                    System.out.println("Имя:" + firstName + " Фамилия:" + lastName + " Год рождения:" + bYear);
                    break;
                }
                case 0: {
                    return;
                }
                default: {
                    System.out.println("Неверное значение");
                }
            }
        }
    }
}