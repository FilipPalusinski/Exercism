public class JedliksToyCar {
    private int mileage = 0;
    private int batteryPercentage = 100;
    
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
            return String.format("Driven %d meters", mileage);
    }

    public String batteryDisplay() {
        if (batteryPercentage == 0) {
            return "Battery empty";
        } else {
            return String.format("Battery at %d%%", batteryPercentage);
        }
    }

    public void drive() {
        if (batteryPercentage > 0) {
            mileage += 20;
            batteryPercentage -= 1;
        }
    }
}
