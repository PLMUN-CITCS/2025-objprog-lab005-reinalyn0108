public class MathLibraryDemo {
    public static void main(String[] args) {
        double base = 2;
        int exponent = 3;
        double powerResult = Math.pow(base, exponent);
        double numberForSqrt = 16;
        double sqrtResult = Math.sqrt(numberForSqrt);

        double numberToRound = 5.7;
        long roundedNumber = Math.round(numberToRound); // Fix: Define roundedNumber

        double randomNumber = Math.random(); // Fix: Define randomNumber

        System.out.println("Power: " + powerResult);
        System.out.println("Square Root: " + sqrtResult);
        System.out.println("Rounded Number: " + roundedNumber);
        System.out.println("Random Number: " + randomNumber); // Fix: Add semicolon
    }
}
