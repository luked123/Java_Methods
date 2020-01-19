public class PrimeNumber {

    /** Main method and driver */
    public static void main(String [] args){
        final int NUMBER_OF_PRIMES = 600;
        final int PRIMES_PER_LINE = 10;

        displayPrimes(NUMBER_OF_PRIMES, PRIMES_PER_LINE);
    }

    /** Tests if a number is prime or not */
    public static boolean isPrime(int number){
        for(int divisor = 2; divisor <= (number / 2); divisor ++){
            if(number % divisor == 0){
                return false;
            }
        }
        return true;
    }

    /** Displays an amount of primes up to numberOfPrimes and displays an amount of them per line */
    public static void displayPrimes(int numberOfPrimes, int primesPerLine){
        int count = 0;
        int number = 2;

        while(count < numberOfPrimes){
            if(isPrime(number)){
                count ++;
                System.out.printf("%d ", number);
                if(count % primesPerLine == 0){
                    System.out.println();
                }
            }
            number++;
        }
    }
}
