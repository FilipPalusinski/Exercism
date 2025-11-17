class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        int[] digits = String.valueOf(numberToCheck)
            .chars()
            .map(c -> c - '0')
            .toArray();

        int power = digits.length;
        int result = 0;
        for(int digit : digits) {
            result += Math.pow(digit, power);
        }
        
        return result == numberToCheck ? true : false; 
    }

}
