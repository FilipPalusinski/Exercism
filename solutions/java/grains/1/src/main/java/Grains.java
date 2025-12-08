import java.math.BigInteger;

class Grains {

    BigInteger grainsOnSquare(final int square) {
        if (square < 1 || square > 64) {
            throw new IllegalArgumentException("square must be between 1 and 64");
        }    
        return BigInteger.valueOf(2).pow(square - 1);
    }

    BigInteger grainsOnBoard() {
        BigInteger total = BigInteger.ZERO;
        for (int x = 1; x <= 64; x++) {
            total = total.add(grainsOnSquare(x));
        }
        return total;
    }

}
