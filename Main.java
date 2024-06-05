import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Please input the day of the month.");
        int day = user.nextInt();
        System.out.println("Please input the month of the week. (3 = March, 4 = April, 5 = May, 6 = June, 7 = July, 8 = August, 9 = September, 10 = October, 11 = November, 12 = December, 13 = January, 14 = February) Do NOT use 1 and 2 for anything.");
        int month = user.nextInt();
        System.out.println("Please input the year");
        int year = user.nextInt();
        int equation = (day + (13 * (month + 1) / 5) + (year % 100) + (year % 100 / 4) + (year / 100 / 4) + (5 * (year / 100))) % 7;
        if (equation == 0) {
            System.out.println("The day of the week is Saturday.");
        } else if (equation == 1) {
            System.out.println("The day of the week is Sunday.");
        } else if (equation == 2) {
            System.out.println("The day of the week is Monday.");
        } else if (equation == 3) {
            System.out.println("The day of the week is Tuesday.");
        } else if (equation == 4) {
            System.out.println("The day of the week is Wednesday.");
        } else if (equation == 5) {
            System.out.println("The day of the week is Thursday.");
        } else {
            System.out.println("The day of the week is Friday.");
        }
    }
}