class PrimeCalculator {

    int nth(int nth) {
        if (nth == 0) {
            throw new IllegalArgumentException("0th prime is undefined");
        }
        int primeNumberCount = 0;
        int currentNumber = 0;
        while (primeNumberCount < nth) {
            currentNumber += 1;
            if (isPrime(currentNumber)) {
                primeNumberCount += 1;
            }
        }
        return currentNumber;
    }

    private boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int divisor = 2; divisor * divisor <= number; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
