public class ProjectTemp{

    /**
    * Determines if a given number is prime.
    *
    * @param number The number to check for primality.
    * @return {@code true} if the number is prime, {@code false} otherwise.
    * @throws IllegalArgumentException If the input number is less than 2.
    */
    public static boolean isPrime(int number) {
        if (number < 2) {
            throw new IllegalArgumentException("Number must be greater than or equal to 2.");
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args){
        for(int i = 1; i <= 15; i++){
            if(isPrime(i))
                System.out.println(i+" ");
        }
        
    }
}