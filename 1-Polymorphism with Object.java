interface Operation {
    double calculate(double a, double b);
}

class Addition implements Operation {
    @Override
    public double calculate(double a, double b) {
        return a + b;
    }
}

class Subtraction implements Operation {
    @Override
    public double calculate(double a, double b) {
        return a - b;
    }
}

class Multiplication implements Operation {
    @Override
    public double calculate(double a, double b) {
        return a * b;
    }
}

class Division implements Operation {
    @Override
    public double calculate(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Cannot divide by zero.");
            return Double.NaN;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Operation addOperation = new Addition();
        Operation subtractOperation = new Subtraction();
        Operation multiplyOperation = new Multiplication();
        Operation divideOperation = new Division();

        System.out.println(addOperation.calculate(2, 4));        // Output: 6.0
        System.out.println(subtractOperation.calculate(5.5, 6.3));  // Output: -0.7999999999999998
        System.out.println(multiplyOperation.calculate(2, 4));   // Output: 8.0
        System.out.println(divideOperation.calculate(5.5, 2.2)); // Output: 2.5
    }
}
