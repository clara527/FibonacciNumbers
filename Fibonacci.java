public class Fibonacci {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Enter a number");
            return;
        }
        
        int number;
        try {
            number = Integer.parseInt(args[0]);
            if (number < 0) {
                System.out.println("Number has to be positive");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Error, please enter a valid positive integer");
            return;
        }
        
        int fibonacciResult = getFibonacci(number);
        System.out.println("Fibonacci of " + number + " is: " + fibonacciResult);
    }
    
    public static int getFibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        
        int a = 0, b = 1, result = 0;
        for (int i = 2; i <= n; i++) {
            result = a + b;
            a = b;
            b = result;
        }
        return result;
    }
}

