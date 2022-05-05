public class Prime {
    public boolean isPrime(int number) {
        if (number < 2) return false;
        if (number == 2) return true;
        for (int i = 2; i < (int) Math.sqrt(number)+1; i++) {
            if (number % i ==0) return false;
        }
        return true;
    }
}