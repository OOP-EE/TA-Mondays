package main;

public class Main {

    public static int factorial(int n) throws FactorialException {
        int answer = 1;
        if (n < 0) {
            throw new FactorialException();
        }
        for (int i = 1; i <= n; i++) {
            answer *= i;
        }
        return answer;
    }


    public static void main(String[] args) {
        try {
            System.out.println(factorial(-4));
        } catch (FactorialException e) {
            e.printStackTrace();
        }
        System.out.println("here");
    }
}

class FactorialException extends Exception {
    public FactorialException() {
        super("factorial error : n < 0");
    }
}
