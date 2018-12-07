package com.company;

        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        boolean c = scanner.nextBoolean();
        System.out.println(posNeg(a,b,c));

    }

    public static boolean posNeg(int n,int m,boolean negative) {

        if (n < 0 && m > 0) {
            return true;
        }
        if (m < 0 && n > 0) {
            return true;
        }
        if (n < 0 && m < 0 && negative) {
            return true;
        }

        return false;
    }}






