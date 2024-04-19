import java.util.Scanner;


class Main {

    public static long gcd(long m, long n) {
        // Calculate GCD of the sum of A fibonacci numbers and the sum of B fibonacci numbers
        // GCD (A, B)
        
        long a = 0;
        long b = 0;
        long q = 0;
        if (m < n) {
            // Sets it up such that a is always the largest number
            a = n;
            b = m;
        } else if (m > n) {
            a = m;
            b = n;
        } else {
            // if a and b are the same number then gcd is going to be a or b
            System.out.println("a = qb + r"  + "   ||||   " + m + " = " + "1" + "*" + n + " + " + "0");
            return n;
            
        }
        long r = a % b;
        // Finds the remainder of a and b
        q = (a / b);
        // Gives a value to Q, which is meant to represent the number of times b goes into a 
        System.out.println("a = qb + r"  + "   ||||   " + a + " = " + q + "*" + b + " + " + r);
        while (r != 0) {
            // Implements euclidean algorithm
           
           
            a = b;
            b = r;
            q = (a / b);
            r = a % b;
            // Re-assigns variables according the euclidean algorithm
            System.out.println("a = qb + r"  + "   ||||   " + a + " = " + q + "*" + b + " + " + r);
            

        }
        return b;
    }
    
    static double gR = (1 + Math.sqrt(5)) / 2; // Golden ratio as a variable
    
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Integer A (Number Must Be A Positive Integer and Less than 69)");
        String a = myObj.nextLine();  // Read user input for number A
        
        while (!a.matches("[0-9]+") || Integer.parseInt(a) < 1 || Integer.parseInt(a) > 68) {
            // Checks if the input is valid
            System.out.println("Invalid Input. Please Enter a Positive Integer Less than 69");
            // dont allow the user to input strings, or numbers that arent integers
            a = myObj.nextLine();
            
        }
        int A = Integer.parseInt(a);  // Convert user input to integer
        

        System.out.println("Enter Integer B (Number Must Be A Positive Integer and Less than 69)");
        String b = myObj.nextLine();  // Read user input for number B


        while (!b.matches("[0-9]+") || Integer.parseInt(b) < 1 || Integer.parseInt(b) > 68) {
            // Checks if the input is valid
            System.out.println("Invalid Input. Please Enter a Positive Integer Less than 69");
            // dont allow the user to input strings, or numbers that arent integers
            b = myObj.nextLine();
            
        }
        int B = Integer.parseInt(b);  // Convert user input to integer

        myObj.close(); // Close the Scanner object

        double sumOfFibA = ((Math.pow(gR, A + 2) - Math.pow(1 - gR, A + 2)) / Math.sqrt(5)) - 1;
        // Uses the fact that the sum of the first n fibonacchi numbers is equal to f(n+2) - 1 to calculate sum of the first A fibonacchi numbers
        // binets formula is used to calculate the (n + 2)th fibonacchi number 
        double sumOfFibB = ((Math.pow(gR, B + 2) - Math.pow(1 - gR, B + 2)) / Math.sqrt(5)) - 1;
        // Same process as sumOfFibA but for variable B

        // Round the sums to the nearest integer
        long roundedSumOfFibA = Math.round(sumOfFibA);
        long roundedSumOfFibB = Math.round(sumOfFibB);

        System.out.println("Sum of First " + A + " Fibonacci numbers: " + roundedSumOfFibA);
        System.out.println("Sum of First " + B + " Fibonacci numbers: " + roundedSumOfFibB);
        // Prints out sum of the first A and B fibonacchi numbers
        System.out.println("GCD of the sum of the first " + A + " fibonacci numbers and the sum of the first " + B + " fibonacci numbers: " + gcd(roundedSumOfFibA, roundedSumOfFibB));
        // Prints out the gcd of the sum of the first A and B fibonacchi numbers

        // print sum of first 100 fibonacchi numbers to find bounds
            // for (int i =1; i < 100; i++) {
            //     double UnroundedSubractFloor = (((Math.pow(gR, i + 2) - Math.pow(1 - gR, i + 2)) / Math.sqrt(5)) - 1);
            //     System.out.println(i   + ") " + ((UnroundedSubractFloor) - Math.round(UnroundedSubractFloor)));
            // }
        

    
        
        
    }
}