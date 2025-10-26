import java.util.Random;

class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }

    char randomPlanetClass() {
        int randomNumber = random.nextInt(PLANET_CLASSES.length);
        return PLANET_CLASSES[randomNumber];
    }

    String randomShipRegistryNumber() {
        int randomNumber = 1000 + random.nextInt(9000);
        return "NCC-" + randomNumber;
    }

    double randomStardate() {
        return 41000.0 + 1000.0 * random.nextDouble();
    }
}
