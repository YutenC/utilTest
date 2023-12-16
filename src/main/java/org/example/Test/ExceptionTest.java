package org.example.Test;

public class ExceptionTest extends Throwable {

    public static void main(String[] args) {

        int test = 0;
        try {
            for (int i = 0; i <= 5; i++) {
                if (test == 4) {
                    throw new Exception("test is 4");
                }
                test = test + 1;
                System.out.println("Count test is " + test);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finally test is " + test);
        }
    }
}
