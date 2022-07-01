package calculator;

import calculator.Calculation;

class CalculationTest {
    public static void main(String[] args) {
        Calculation maths = new Calculation();

        int addNumbers = maths.addNumber(33, 4);
        System.out.printf("Sum is: %d%n", addNumbers);

        int subtractNumbers = maths.subtractNumber(33, 4);
        System.out.printf("Subtraction is: %d%n", subtractNumbers);

        int multiplyNumbers = maths.multiplyNumber(33, 4);
        System.out.printf("Multiplication: %d%n", multiplyNumbers);

        int divideNumber = maths.divideNumber(33, 4);
        System.out.printf("Division: %d%n", divideNumber);
    }
}