package Sec5;

public class Sec5 {

    public static void main(String[] args) {

        System.out.println(isPerfectNumber(6));
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

    public static boolean hasSharedDigit (int a, int b){
        if( (a < 10 || a > 99) || (b<10 || b> 99))
            return false;
        int rightA = a % 10;
        int leftA = a / 10;
        int rightB = b%10;
        int leftB = b/10;
        return (rightA == rightB || rightA == leftB || leftA == rightB || leftA == leftB);

    }

    public static  boolean isPerfectNumber (int number){
        int sumDiv = 0;
        if(number < 1)
            return false;
        for(int i = 1; i< number ; i++){
            sumDiv += (number % i == 0) ? i : 0;
        }
        return sumDiv == number;
    }

}
