public class Calculator {
    // The Calculator class is used to perform basic arithmetic operations.

    // A default constructor is defined.
    public Calculator() {
    }

    // Method to add two numbers.
    public int add(int a, int b) {
        return a + b;
    }

    // Method to subtract two numbers.
    public int subtract(int a, int b) {
        return a - b;
    }

    // Method to multiply two numbers.
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method to divide two numbers.
    public int divide(int a, int b) {
        return a / b;
    }

    // Method to calculate the remainder of one number divided by another.
    public int modulo(int a, int b) {
        return a % b;
    }

    // The main method performs calculations and prints the results to the console.
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        System.out.println(myCalculator.add(5, 7));
        System.out.println(myCalculator.subtract(45, 11));
        System.out.println(myCalculator.multiply(7, 5));
        System.out.println(myCalculator.divide(10, 2));
        System.out.println(myCalculator.modulo(20, 3));
    }
}
