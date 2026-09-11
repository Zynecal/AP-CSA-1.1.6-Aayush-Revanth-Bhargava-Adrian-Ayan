public class NumbersRiddle_v2 {
    public static void main(String[] args) {
        
        int startingNumber = 1;

        int negativeStartingNumber = -1;

        double doubleStartingNumber = 1.5;
        
        double doubleNegativeStartingNumber = -1.5;

        int zeroStartingNumber = 0;

        int largerStartingNumber = 10;

        final double addNumber = 6.0;


        System.out.print("Numbers Riddle Program");
        System.out.println();
        // This is the algorithm for the first riddle number
        System.out.println();
        System.out.println("Trial 1: Starting number is: " + startingNumber);
        
        double riddleNumber = 2 * startingNumber;
        System.out.println("The riddle number is: " + riddleNumber);
        riddleNumber += addNumber;
        System.out.println("The riddle number is: " + riddleNumber);
        riddleNumber = riddleNumber / 2;
        System.out.println("The riddle number is: " + riddleNumber);
        riddleNumber = riddleNumber - startingNumber;
        System.out.println("The riddle number is: " + riddleNumber);


        // This is the algorithm for the second riddle number 
        System.out.println();
        System.out.println("Trial 2: Starting number is: " + negativeStartingNumber);
        
        double riddleNumber2 = 2 * negativeStartingNumber;
        System.out.println("The riddle number is: " + riddleNumber2);
        riddleNumber2 = riddleNumber2 + addNumber;
        System.out.println("The riddle number is: " + riddleNumber2);
        riddleNumber2 = riddleNumber2 / 2;
        System.out.println("The riddle number is: " + riddleNumber2);
        riddleNumber2 = riddleNumber2 - negativeStartingNumber;
        System.out.println("The riddle number is: " + riddleNumber2);

        // This is the algorithm for the third riddle number 
        System.out.println();
        System.out.println("Trial 3: Starting number is: " + doubleStartingNumber);
        

        double riddleNumber3 = 2 * doubleStartingNumber;
        System.out.println("The riddle number is: " + riddleNumber3);
        riddleNumber3 = riddleNumber3 + addNumber;
        System.out.println("The riddle number is: " + riddleNumber3);
        riddleNumber3 = riddleNumber3 / 2;
        System.out.println("The riddle number is: " + riddleNumber3);
        riddleNumber3 = riddleNumber3 - doubleStartingNumber;
        System.out.println("The riddle number is: " + riddleNumber3);

        // This is the algorithm for the fourth riddle number
        System.out.println();
        System.out.println("Trial 4: Starting number is: " + doubleNegativeStartingNumber);
        

        double riddleNumber4 = 2 * doubleNegativeStartingNumber;
        System.out.println("The riddle number is: " + riddleNumber4);
        riddleNumber4 = riddleNumber4 + addNumber;
        System.out.println("The riddle number is: " + riddleNumber4);
        riddleNumber4 = riddleNumber4 / 2;
        System.out.println("The riddle number is: " + riddleNumber4);
        riddleNumber4 = riddleNumber4 - doubleNegativeStartingNumber;
        System.out.println("The riddle number is: " + riddleNumber4);

        // This is the algorithm for the fifth riddle number
        System.out.println();
        System.out.println("Trial 5: Starting number is: " + zeroStartingNumber);
        

        double riddleNumber5 = 2 * zeroStartingNumber;
        System.out.println("The riddle number is: " + riddleNumber5);
        riddleNumber5 = riddleNumber5 + addNumber;
        System.out.println("The riddle number is: " + riddleNumber5);
        riddleNumber5 = riddleNumber5 / 2;
        System.out.println("The riddle number is: " + riddleNumber5);
        riddleNumber5 = riddleNumber5 - zeroStartingNumber;
        System.out.println("The riddle number is: " + riddleNumber5);

        // This is the algorithm for the sixth riddle number
        System.out.println();
        System.out.println("Trial 6: Starting number is: " + largerStartingNumber);
        

        double riddleNumber6 = 2 * largerStartingNumber;
        System.out.println("The riddle number is: " + riddleNumber6);
        riddleNumber6 = riddleNumber6 + addNumber;
        System.out.println("The riddle number is: " + riddleNumber6);
        riddleNumber6 = riddleNumber6 / 2;
        System.out.println("The riddle number is: " + riddleNumber6);
        riddleNumber6 = riddleNumber6 - largerStartingNumber;
        System.out.println("The riddle number is: " + riddleNumber6);




    }
}
