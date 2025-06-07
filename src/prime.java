public class prime {
    public static void main(String[] args) {
        int n = 99;
        int largestPrime = -1;
        for (int i = n - 1; i >= 2; i--) {
            if (isPrime(i)) {
                largestPrime = i;
                break;
            }
        }
        System.out.println("Largest prime less than  " + largestPrime);
    }
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

