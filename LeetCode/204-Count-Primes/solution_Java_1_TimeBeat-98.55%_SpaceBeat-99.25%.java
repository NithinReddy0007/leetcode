class Solution {
    public int countPrimes(int n) {

        if (n <= 2) return 0;

        int size = n / 2;              // only odd numbers
        boolean[] isPrime = new boolean[size];

        // Assume all odd numbers are prime initially
        for (int i = 1; i < size; i++) {
            isPrime[i] = true;
        }

        int limit = (int)Math.sqrt(n);

        for (int i = 1; (2*i + 1) <= limit; i++) {
            if (isPrime[i]) {
                int prime = 2*i + 1;

                // start from prime*prime
                int start = (prime * prime) / 2;

                for (int j = start; j < size; j += prime) {
                    isPrime[j] = false;
                }
            }
        }

        int count = 1; // include prime 2

        for (int i = 1; i < size; i++) {
            if (isPrime[i]) count++;
        }

        return count;
    }
}
