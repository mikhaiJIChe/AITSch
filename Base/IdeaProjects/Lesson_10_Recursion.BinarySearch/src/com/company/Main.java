package com.company;

public class Main {

    public static int getPow(int number, int degree) {
        if (degree == 0) {
            return 1;
        }
        return getPow(number, degree - 1) * number;
    }

    public static int getPow1(int number, int degree) {

        if (degree == 0) {
            return 1;
        } else {
            int result = 1;
            for (int i = 1; i <= degree; ++i) {
                result *= number;
            }
            return result;
        }
    }

        public static void main (String[]args){
            System.out.println(getPow1(2, 10));
        }
    }
