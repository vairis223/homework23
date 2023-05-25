package io.codelex.exceptions.practice;

public class Exercise2 {
    public static void methodA() throws ArithmeticException {
        try {
            methodB();
        } catch (ArithmeticException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void methodB() throws ArithmeticException {
            try {
                methodC();
            } catch (ArithmeticException e) {
                e.printStackTrace();
                throw e;
            }
        }

            public static void methodC () throws ArithmeticException {
                try {
                    int a = 10;
                    int b = 0;
                    int result = a / b;
                    System.out.println(result);
                } catch (ArithmeticException e) {
                    e.printStackTrace();
                    throw e;
                }
            }
            public static void main (String[]args){
                try {
                    methodA();
                } catch (ArithmeticException e) {
                    e.printStackTrace();
                }
            }
        }