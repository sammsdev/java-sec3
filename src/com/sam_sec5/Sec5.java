package com.sam_sec5;

import java.util.Scanner;

public class Sec5 {

    public static void main(String[] args) {

        // System.out.println(numberToWords(123));
        inputThenPrintSumAndAverage();
    }

    public static void printDayOfTheWeek(int day) {

        switch (day) {

            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
                break;

        }


    }

    public static boolean isOdd(int number) {

        return (number % 2 != 0) && (number > 0);
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if ((start < 0 || end < 0) || end <= start)
            return -1;
        for (int i = start; i <= end; i++) {
            sum += isOdd(i) ? i : 0;
        }
        return sum;
    }

    public static int sumDigits(int number) {
        int aux = 0, remaining = 0, sum = 0;
        if (number <= 10)
            return -1;
        while (number > 0) {
            remaining = number % 10;
            sum += remaining;
            number /= 10;
        }
        return sum;
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0, lastDigit = 0, original = number;
        while (number != 0) {
            lastDigit = number % 10;
            reverse += lastDigit;
            reverse *= 10;
            number /= 10;
        }
        reverse /= 10;
        return original == reverse;
    }

    public static int sumFirstAndLastDigit(int number) {
        int lastDigit = 0;
        if (number < 0)
            return -1;
        lastDigit = number % 10;
        while (number >= 10) {
            number /= 10;
        }
        return number + lastDigit;

    }

    public static int getEvenDigitSum(int number) {
        int sum = 0;
        if (number < 0)
            return -1;
        while (number > 0) {
            int lastDigit = number % 10;
            number /= 10;
            if (lastDigit % 2 == 0)
                sum += lastDigit;
        }
        return sum;
    }

    public static boolean hasSharedDigit(int a, int b) {
        if ((a < 10 || a > 99) || (b < 10 || b > 99))
            return false;
        int rightA = a % 10;
        int leftA = a / 10;
        int rightB = b % 10;
        int leftB = b / 10;
        return (rightA == rightB || rightA == leftB || leftA == rightB || leftA == leftB);

    }

    public static boolean isPerfectNumber(int number) {
        int sumDiv = 0;
        if (number < 1)
            return false;
        for (int i = 1; i < number; i++) {
            sumDiv += (number % i == 0) ? i : 0;
        }
        return sumDiv == number;
    }

    public static int getDigitCount(int number) {
        if (number < 0)
            return -1;
        if (number == 0)
            return 1;
        int c = 0;
        while (number > 0) {
            number /= 10;
            c++;
        }
        return c;
    }

    public static int reverse(int number) {
        int reverse = 0, lastDigit = 0;

        while (number != 0) {
            lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number /= 10;
        }
        return reverse;
    }

    public static void numberToWords(int number) {

        int lastDigit = 0;
        int correctOrderNum = reverse(number);
        int dif = (getDigitCount(number) - getDigitCount(correctOrderNum));
        if (correctOrderNum == 0)
            System.out.print("Zero ");
        if (getDigitCount(number) == -1)
            System.out.println("Invalid Value");

        while (correctOrderNum > 0) {
            lastDigit = correctOrderNum % 10;
            correctOrderNum /= 10;
            switch (lastDigit) {
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
            }
        }
        if (dif != 0) {
            for (int i = 0; i < dif; i++)
                System.out.print("Zero ");
        }

    }

    public static void inputThenPrintSumAndAverage() {
        int sum = 0, c = 0;
        long avg = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                sum+= scanner.nextInt();
                c++;
                avg = Math.round((sum/c ));
            } else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("SUM = " + sum + " AVG = " + avg);
        scanner.close();

    }


}
