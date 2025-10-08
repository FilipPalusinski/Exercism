public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        int totalMinutesInOven = 40;
        return totalMinutesInOven;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int bakingTime) {
        int expectedMinutesInOven = expectedMinutesInOven();
        return expectedMinutesInOven - bakingTime;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int numberOfLayers) {
        return numberOfLayers * 2;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int numberOfLayers, int bakingTime) {
        int preparationTimeInMinutes = preparationTimeInMinutes(numberOfLayers);
        return preparationTimeInMinutes + bakingTime;
    }
}
