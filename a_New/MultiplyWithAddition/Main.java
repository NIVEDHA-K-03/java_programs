public class Main {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 5;
        int result = multiplyWithAddition(num1, num2);
        System.out.println("Result: " + result);
    }

    public static int multiplyWithAddition(int num1, int num2) {
        if (num1 == 0 || num2 == 0) {
            return 0; // Multiplying by 0 results in 0
        }

        int result = 0;

        // Ensure num1 is the smaller number to minimize iterations
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        // Use a loop to add num1 to result num2 times
        for (int i = 0; i < Math.abs(num1); i++) {
            result += num2;
        }

        // Handle negative numbers
        if ((num1 < 0 && num2 > 0) || (num1 > 0 && num2 < 0)) {
            result = -result;
        }

        return result;
    }
}
