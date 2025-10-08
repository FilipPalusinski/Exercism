public class Lasagna {
    public int expectedMinutesInOven() {
        int totalMinutesInOven = 40;
        return totalMinutesInOven;
    }

    public int remainingMinutesInOven(int bakingTime) {
        int expectedMinutesInOven = expectedMinutesInOven();
        return expectedMinutesInOven - bakingTime;
    }

    public int preparationTimeInMinutes(int numberOfLayers) {
        return numberOfLayers * 2;
    }

    public int totalTimeInMinutes(int numberOfLayers, int bakingTime) {
        int preparationTimeInMinutes = preparationTimeInMinutes(numberOfLayers);
        return preparationTimeInMinutes + bakingTime;
    }
}
