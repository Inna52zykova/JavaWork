package Lesson2;

public class FirstApp {
    public static void main(String[] ergs) {
        System.out.println( withIn10and20(7,8));
        isPositiveOrNegative(-10);
        System.out.println(isNegative(-20));
        printWordNTimes("word",6);
        System.out.println(isYearVisokosniy(1982));
    }
    public static boolean withIn10and20(int a, int b) {
        return (a+b >= 10 && a+b >= 20);
    }
    public static void isPositiveOrNegative(int n) {
        if (n>=0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }
    public static boolean isNegative(int x) {
        if (x>=0) {
            return true;
        }
        return false;
    }
    public static void printWordNTimes(String word, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(word);
        }
    }
    public static boolean isYearVisokosniy(int year) {
        return (year % 4==0 && year % 100 ==0 || year % 400 ==0);
    }
}



