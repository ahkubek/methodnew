public class Main {
    private static String[] args;

    public static void main(String[] args) {
        int year = 2023;
        printinfoAboutYear(year);
        // task2();
        //task3
        //task4
    }

    //task1
    private static void printinfoAboutYear(int year) {
        year = 2021;
        boolean LeapYear = isLeapYear(year);
        if (LeapYear) {
            System.out.println("год" + year + "Високостный");

        } else {
            System.out.println("год" + year + "не Високостный");
        }


    }

    public static boolean isLeapYear(int year) {
        System.out.println();
        System.out.println("Салам алейкум Задача 1первая");

        return year % 4 == 0 & year % 100 != 0 || year % 400 == 0;
        }

    }
