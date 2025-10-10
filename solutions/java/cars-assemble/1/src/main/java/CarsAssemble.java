public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        int carsPerHour = speed * 221;
        if (speed > 4 && speed < 9 ) {
            return carsPerHour * 0.9;
        } else if (speed == 9) {
            return carsPerHour * 0.8;
        } else if (speed == 10) {
            return carsPerHour * 0.77;
        } else {
            return carsPerHour;
        }
    }

    public int workingItemsPerMinute(int speed) {
        int carsPerMinute = (int) (productionRatePerHour(speed) / 60);
        return carsPerMinute;
    }
}
