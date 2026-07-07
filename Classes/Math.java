package Classes;

class Add {

    public int add(int x, int y) {
        return x + y;

    }

}

class Multiply {

    public int multiply(int x, int y) {
        return x * y;
    }
}

class Subtract {

    public int subtract(int x, int y) {
        return x - y;
    }
}

class Divide {

    public int divide(int x, int y) {
        return x / y;
    }
}

public class Math {
    public static void main(String[] args) {

        Add addition = new Add();
        Multiply multiplication = new Multiply();
        Subtract subtract = new Subtract();
        Divide divide = new Divide();

        int addResult = addition.add(5, 5);
        int multResult = multiplication.multiply(5, 5);
        int subtResult = subtract.subtract(5, 5);
        int divResult = divide.divide(5, 5);

        System.out.println("Addition: " + addResult);
        System.out.println("Multiplication: " + multResult);
        System.out.println("Addition: " + subtResult);
        System.out.println("Addition: " + divResult);

    }

}
