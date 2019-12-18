package com.sam_sec4;

import java.util.Arrays;

public class SectionFour {

    public static  void main (String[] args){
       // printConversion(95.75); //Exercise 1 - Sec 4
       //printMegaBytesAndKiloBytes(-2500); //Exercise 2 - Sec 4
       // System.out.println(shouldWakeUp(true, 44)); //Exercise 3 - Sec 4
       // System.out.println(isLeapYear(-1752)); //Exercise 4
       // System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175)); //Exercise 5
       // System.out.println(hasEqualSum(1,1,2)); //Exercise 6
       //System.out.println(hasTeen(12,22,33));// Exercise 7
        printYearsAndDays(1051200);
    }

    public static long toMilesPerHour(double kilometersPerHour){
        int miles = -1;
        double calc = 0;
        if(kilometersPerHour >=0){
            calc = (kilometersPerHour / 1.609);
            miles = (int)Math.round(calc);
        }
        return miles;
    }
    public static void printConversion(double kilometersPerHour){
        String msg = "";
        int r = 0;

        r = (int)toMilesPerHour(kilometersPerHour);

        if(r == -1){
            System.out.println("Invalid Value");
        } else {
            msg = kilometersPerHour+" km/h = " + r + " mi/h";
            System.out.println(msg);
        }
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        if(kiloBytes < 0) {
            System.out.println("Invalid Value");
        }
        else {
            int mb = (kiloBytes/1024), kb = (kiloBytes%1024);
            System.out.println( kiloBytes + " KB = " + mb + " MB and " + kb + " KB");
        }
    }
    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay){
        return isBarking && ((hourOfDay < 8 || hourOfDay > 22) && hourOfDay >= 0 && hourOfDay <= 23);
    }
    public static boolean isLeapYear (int year){
        boolean r = false;
        if(((year%4==0 && year%100 != 0) || (year%400 == 0)) &&  (year >=1 && year <= 9999)){
            r = true;
        }
        return r;
    }
    public static boolean areEqualByThreeDecimalPlaces (double a, double b){
        boolean r = false;
        a = (int)(a * 1000);
        b = (int)(b * 1000);
        r = (a == b) || r;
        return r;
    }
    public static boolean hasEqualSum (int a, int b, int c){
        return a + b == c;
    }
    public static boolean hasTeen( int a, int b, int c) {
        return (isTeen(a) || isTeen(b) || isTeen(c));
    }
    public static  boolean isTeen( int p ) {
        boolean r=false;
        if( (p >= 13 && p <=19)){
            r = true;
        }
        return r;
    }
    public static String getDurationString(long minutes, long seconds) {
        if(minutes < 0 || (seconds < 0 || seconds > 59)){
            return "Invalid Value";
        }
        long hours = minutes/60;
        long remainingMinutes = minutes % 60;
        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }
    public static String getDurationString(long seconds) {
        if(seconds < 0)
            return "Invalid Value";
        long minutes = seconds/60;
        long remainingSeconds = seconds%60;
        return getDurationString(minutes, remainingSeconds);
    }
    public static double area (double radius){
        if(radius < 0) {
           return -1;
        }
        return Math.PI * radius * radius;
    }
    public static double area (double x, double y) {
        if( x < 0 || y < 0)
            return -1;
        return x * y;
    }
    public static void printYearsAndDays (long minutes){
        int days = 0 , years = 0, hours = 0;
        if(minutes < 0)
            System.out.println("Invalid Value");
        else {
            hours = (int) (minutes/60);
            days = hours / 24;
            years = days / 365;
            days = days % 365;
            System.out.println( minutes + " min = " + years + " y and " + days + " d");
        }

    }

    public static void printEqual(int a, int b,  int c){
        if( a < 0 || b < 0 || c < 0)
            System.out.println("Invalid Value");
        else {
            if( a == b && b == c)
                System.out.println("All numbers are equal");
            else if(a != b && b != c && c!= a)
                System.out.println("All numbers are different");
            else
                System.out.println("Neither all are equal or different");
        }
    }

    public static boolean isCatPlaying (boolean summer, int temperature){
        int upperLmt = summer ? 45 : 35;
        return temperature >= 25 && temperature <= upperLmt;
    }

}
