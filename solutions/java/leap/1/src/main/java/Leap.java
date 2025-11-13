class Leap {

    boolean isLeapYear(int year) {
         return isDivisibleBy(year, 400)
        || (isDivisibleBy(year, 4) && !isDivisibleBy(year, 100));
    }

    boolean isDivisibleBy(int dividend, int divisor) {
        return dividend % divisor == 0;
    }

}
