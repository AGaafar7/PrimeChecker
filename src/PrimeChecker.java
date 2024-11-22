class PrimeChecker extends Number {

    public PrimeChecker(int number) {
        super(number);
    }

    public boolean isPrime() {
        int num = getNumber();

        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
