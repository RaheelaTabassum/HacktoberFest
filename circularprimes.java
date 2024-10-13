import java.util.ArrayList;  
import java.util.List;  
public class CircularPrimesExample {  
    public static void main(String[] args) {  
        int start = 1;  
        int end = 1000;  
        List<Integer> circularPrimes = getCircularPrimesInRange(start, end);  
        System.out.println("Circular Primes within the range " + start + " to " + end + ":");  
        for (int prime : circularPrimes) {  
            System.out.println(prime);  
        }  
    }  
    public static List<Integer> getCircularPrimesInRange(int start, int end) {  
        List<Integer> circularPrimes = new ArrayList<>();  
        for (int i = start; i <= end; i++) {  
            if (isCircularPrime(i)) {  
                circularPrimes.add(i);  
            }  
        }  
        return circularPrimes;  
    }  
    public static boolean isCircularPrime(int number) {  
        String numberString = String.valueOf(number);  
        for (int i = 0; i < numberString.length(); i++) {  
            if (!isPrime(Integer.parseInt(numberString))) {  
                return false;  
            }  
            numberString = numberString.substring(1) + numberString.charAt(0);  
        }  
        return true;  
    }  
    public static boolean isPrime(int number) {  
        if (number < 2) {  
            return false;  
        }  
        for (int i = 2; i <= Math.sqrt(number); i++) {  
            if (number % i == 0) {  
                return false;  
            }  
        }  
        return true;  
    }  
}  
