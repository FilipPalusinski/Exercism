class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar>{
    private int drivenDistance = 0;
    private int numberOfVictories = 0;

    @Override
    public void drive() {
        this.drivenDistance += 10;
    }

    @Override
    public int getDistanceTravelled() {
        return this.drivenDistance;
    }

    public int getNumberOfVictories() {
        return this.numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories += numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar other) {
        return Integer.compare(other.numberOfVictories, this.numberOfVictories);
    }
}
