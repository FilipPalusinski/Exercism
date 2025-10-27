public class ExperimentalRemoteControlCar implements RemoteControlCar{
    private int drivenDistance = 0;

    @Override
    public void drive() {
        this.drivenDistance += 20;
    }

    @Override
    public int getDistanceTravelled() {
        return this.drivenDistance;
    }
}


